
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력 스트림
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력 스트림
        int num = Integer.parseInt(br.readLine());

        if(num%4 == 0) {
            if(num%100 != 0 || num%400 == 0) {
                bw.write(1+"\n");
            }else {
                bw.write(0+"\n");
            }
        }else {
            bw.write(0+"\n");
        }
        br.close();
        bw.close();
    }
}
