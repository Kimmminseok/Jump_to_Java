package Study_Java.Sample;

abstract class Predator extends Animal3 {
    abstract String getfood();

    void printFood() {
        System.out.printf("my food is %s\n", getfood());
    }
}

interface Barkable {
    void bark();
}

/*
인터페이스는 일반 클래와는 달리 extends를 이용하여
여러 개의 인터페이스(Predator, Barkable ...)를 동시에 상속할 수 있다.
인터페이스 : 다중 상속 가능
일반 클래스는 단일 상속만 가능하다.
*/
class Animal3 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Predator implements Barkable {
    public String getfood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Predator implements Barkable {
    @Override
    public String getfood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}


class ZooKeeper {
    void feed(Predator predator){
        System.out.println("feed " + predator.getfood());
    }
}

class Bouncer {
    void barkAnimal(Barkable animal){
        animal.bark();
    }
}

public class Sample7 {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
