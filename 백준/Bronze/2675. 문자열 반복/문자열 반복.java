
import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken()); //반복 횟수
            String S = st.nextToken();               //반복할 문자열

            for(int j=0; j<S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    sb.append(S.charAt(j)); //append = 문자열을 더하는 역할을 하는 method
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);

        br.close(); //입력버퍼 닫기
    }
}