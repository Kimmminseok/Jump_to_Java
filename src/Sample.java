import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

class Util {
    public static String getCurrentDate(String fmt){
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
}

public class Sample {
    public static void main(String[] args) {
        System.out.println(Util.getCurrentDate("yyyyMMdd"));
    }
}
