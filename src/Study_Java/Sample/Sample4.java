package Study_Java.Sample;

public class Sample4 {
    int a;

    void varTest(){
        this.a++;
    }

    public static void main(String[] args) {
        Sample4 sample4 = new Sample4();
        sample4.a = 1;
        sample4.varTest();
        System.out.println(sample4.a);
    }
}
