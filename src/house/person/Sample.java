package house.person;

import house.HousePark;

class Counter  {
    static int count = 0;
    // static을 붙이기 전보다 c2 값이 1 올라감.
    // static 키워드는 프로그래밍할 때 공유의 목적으로 많이 사용됨.
    Counter() {
        count++;
        System.out.println(count);
    }

    public static int getCount() {
        return count;
    }
}

public class Sample {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(Counter.getCount());
        // 스태틱 메서드는 클래스를 이용하여 호출
    }
}
