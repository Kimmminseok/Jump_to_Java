package CH08;

// 공백을 제외한 글자 수 세기
// "점프 투 자바" 라는 문자열이 있을 때 띄어쓰기를 제외한 5라는 숫자 리턴해야함.

public class Sample4 {
    static int getCharCount(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != ' ') { // 공백이 아닌 경우에만 결과값 증가
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getCharCount("점프 투 자바")); // 5 출력
        System.out.println(getCharCount("점프 투 자바의 연습문제 풀이")); // 12 출력
    }
}
