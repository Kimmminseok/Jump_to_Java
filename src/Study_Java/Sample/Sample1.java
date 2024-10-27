package Study_Java.Sample;

class Animal1 {
    String name; // 입력 : String name

    // Animal 클래스에 name 이라는 String 변수를 추가함.
    // name 은 객체 변수 라고 한다. (객체 변수는 변수이므로 값을 대입할 수 있다.)
    // 클래스에 의해 생성되는 것은 객체.
    // 그 클래스에 선언된 변수는 객체 변수.(인스터스 변수, 멤버 변수, 속성)
    // 객체 변수는 도트 연산자(.)를 이용해 접근할 수 있음.
    // example => 객체.객체변수
    // like -> cat.name 객체:cat, 객체 변수:name




    public void setName(String name) { // 출력 : void , '리턴값 없음'을 의미
        this.name = name;
    }
}


public class Sample1 {
    public static void main(String[] args) { //psvm : 단축어
        Animal3 cat = new Animal3();
        cat.setName("body");
        // 객체와 인스턴스의 차이점.
        // cat은 객체, cat은 Animal의 인스턴스

        Animal3 dog = new Animal3();
        dog.setName("happy");

        System.out.println(cat.name); // cat: 객체 name: 객체 변수www
        // sout : 단축어 System.out.println();
        System.out.println(dog.name);




    }
}
