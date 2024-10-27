package Study_Java.Sample;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

// InputStream: byte를 읽는다.
// InputStreamReader: character(문자)을 읽는다.
// BufferedReader: String(문자열)을 읽는다.

public class Sample8 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        // System.in은 InputStream의 객체이다.
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String a = br.readLine();
        System.out.println(a);
    }
}
