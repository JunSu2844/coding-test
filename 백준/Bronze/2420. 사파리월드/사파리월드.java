
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();  //첫번째 줄에 숫자 입력을 문자열로 받아서
        StringTokenizer token = new StringTokenizer(str); //공백을 기준으로 나눔
        long n = Integer.parseInt(token.nextToken()); // 그걸 정수(long)로 받아서 n, m 변수에 입력
        long m = Integer.parseInt(token.nextToken()); // 정수 입력값이 너무 클 수 있어서 long으로 선언 해야 함

        //System.out.println(Math.abs((n-m)));
        bw.write(Math.abs((n-m))+"\n");  //Math.abs() 절대 값 구하는 함수

        bw.flush();   //남아있는 데이터를 모두 출력시킴
        bw.close();   //스트림을 닫음
    }
}
