package CH08;
// 양수를 입력받았을 때 그 양수의 자릿수 구하기

public class Sample3 {
    static int getDigitCount(int n) {

        /*int count = 0;
        while (true) {
            if (n==0){
                break;
            }
            n=n/10; // 숫자 n을 10으로 나누고 그 값을 다시 숫자 n에 대입
            count++;
        }
        return count;
         */
        String s = "" + n;
        return s.length();
        // 숫자를 문자열로 바꾸고 그 개수를 리턴 수정
        // 숫자를 문자열로 바꾸는 방법은 숫자에 빈 문자열을 더해주면 된다.
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(3)); // 1의 자리
        System.out.println(getDigitCount(25)); // 10의 자리
        System.out.println(getDigitCount(333)); // 100의 자리
        System.out.println(getDigitCount(7876)); // 1000의 자리
    }
}
