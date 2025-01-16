
import java.io.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder(); //두 문자열을 합칠 때 문자열이 변화는 값일 경우 사용

        for(int i=0; i<input.length(); i++) {
            char c = input.charAt(i);
            if(Character.isUpperCase(c)) { // 대문자 유뮤 판단 true/false로 리턴
                sb.append(Character.toLowerCase(c)); //입력 인자를 소문자로 변경
            }else {
                sb.append(Character.toUpperCase(c)); //입력 인자를 대문자로 변경
            }
        }
        bw.write(sb+"\n");

        br.close();
        bw.close();
    }
}
