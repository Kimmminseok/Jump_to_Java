package Study_Java.Sample;

class Updater {
    void update(Counter counter){
        counter.count ++;
    }
}

class Counter {
    int count = 0;
}

public class Sample5 {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("beforce update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }
}
