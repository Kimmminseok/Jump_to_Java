package Chapter7;

@FunctionalInterface
// 람다 함수는 2개 이상의 메서드를 가진 인터페이스를 작성하는 것이 불가능하다.
// 따라서 @FunctionalInterface 어노테이션을 사용하는 것이 좋다.
// @FunctionalInterface 인터페이스가 함수형 인터페이스임을 표시하며,
// 단 하나의 메서드만 가질 수 있게 한다. 주로 람다 표현식과 함께 사용한다.

interface Calculator {
    int sum(int a, int b);
}

public class Sample {
    public static void main(String[] args) {
        Calculator mc = Integer::sum;
        int result = mc.sum(3,4 );
        System.out.println(result);
    }
}