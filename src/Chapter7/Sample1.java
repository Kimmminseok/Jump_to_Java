package Chapter7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Sample1 {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data) // IntStream 생성
                .boxed() // IntStream을 Stream<Integer>롤 변경
                .filter((a) -> a%2 == 0) // 짝수만 추출
                .distinct() // 중복 제거
                .sorted(Comparator.reverseOrder()) // 역순으로 정령
                .mapToInt(Integer::intValue) // Stream<Integer>을 IntStream으로 변경
                .toArray() // int[] 배열로 반환
                ;

    }
}
