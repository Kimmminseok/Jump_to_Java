package Study_Java.Sample;

public class Sample3 {
    void sayNick(String nick) {
        if ("바보".equals(nick)){
            return;
        }
        System.out.println("나의 별명은 "+nick+"입니다.");
    }

    public static void main(String[] args) {
        Sample3 sample3 = new Sample3();
        sample3.sayNick("야호");
        sample3.sayNick("바보"); // 출력 X
    }

}
