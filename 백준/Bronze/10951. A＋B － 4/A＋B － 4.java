
import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;

        while((str=br.readLine()) != null) {
            st = new StringTokenizer(str, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");

        }
        br.close(); //입력스트림 닫는다.
        bw.flush(); //스트림 비우기
        bw.close(); //출력스트림 닫기
    }
}