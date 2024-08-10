
import java.io.*;
import java.util.Locale;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int[] arr = new int[26];
        int max = 0;
        char x = '?';


        for (int i = 0; i < str.length(); i++) {     //입력된 알파벳 갯수
            int num = str.charAt(i) - 'A';
            arr[num]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                x = (char)(i+'A');
            }else if(max == arr[i]) {
                x = '?';
            }
        }
        System.out.println(x);

        br.close(); //입력버퍼 닫기
    }
}