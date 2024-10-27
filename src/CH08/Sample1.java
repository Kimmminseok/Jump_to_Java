package CH08;
// 3과 5의 배수 더하기 (1000 미만 자연수)

public class Sample1 {
    public static void main(String[] args) {
        int result = 0;
        for (int n = 1; n< 1000; n++){
            if(n%3 == 0 || n%5 == 0){
                result += n;
            }
        }
        System.out.println(result);
    }

}
