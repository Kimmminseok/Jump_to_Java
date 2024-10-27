package Study_Java.Sample;

public class Sample2 {
    int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Sample2 sample2 = new Sample2();
        // Sample2 클래스가 자기 자신의 객체 생성
        int c = sample2.sum(a, b);

        System.out.println(c);

        // * 매게 변수와 인수의 차이점
        // 매게 변수
        // 메서드에 전달된 입력값을 저장하는 변수
        // 인수는 메서드를 호출할 때 전달하는 입력값
    }
}



/*
 자바의 메서드 구조
 리턴자료형 메서드명(입력자료형1 매개변수1, 입력자료형2 매개변수2, ...) {
    ...
    return 리턴값;     } // 리턴자료형이 void 인 경우에는 return 문이 필요없다.
예시

int sum(int a, int b) {
    return a+b;
}

입력값: int 자료형 a, int 자료형 b
리턴값: int 자료형

Sample sample = new Sample();
int result = sample.sum(3, 4);

*/

