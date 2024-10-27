package Study_Java.Sample;

class Animal2{
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal2 {
    Dog() {
    }

    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
    HouseDog(String name) {
        this.setName(name);
    }

    HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    void sleep(int hour){
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class Sample6 {
    public static void main(String[] args) {
        HouseDog happy = new HouseDog("happy"); // 문자열로 생성
        HouseDog yorkshire = new HouseDog(1); // 숫자값으로 생성
        System.out.println(happy.name);
        System.out.println(yorkshire.name);
    }
}
