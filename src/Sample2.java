import javax.swing.plaf.metal.MetalIconFactory;
import java.io.*;

class FoolException extends Exception {
}

/* Exception : 컴파일 시 발생하는 예외
예측이 가능한 경우에 사용, (=Checked Exception)*/
/* RuntimeException : 실행 시 발생하는 예외
발생할 수도 있고 아닐 수도 있는 경우 사용, (=Unchecked Exception)
*/


public class Sample2 {
    public void sayNick(String nick) throws FoolException {
        if("바보".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        Sample2 sample2 = new Sample2();
        try {
            sample2.sayNick("바보");
            sample2.sayNick("야호");
        } catch (FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }
}


