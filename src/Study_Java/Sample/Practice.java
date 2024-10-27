package Study_Java.Sample;

class  Calculator1 {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}

public class Practice {
    public static void main(String[] args) {
        System.out.println(Calculator1.add(3));
        System.out.println(Calculator1.add(4));
    }
}