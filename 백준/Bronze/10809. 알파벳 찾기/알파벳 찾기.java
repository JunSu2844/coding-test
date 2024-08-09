
import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String str = br.readLine();

        for(int i=0; i<arr.length; i++) {
            arr[i] = -1;
        }
        for(int i=0; i<str.length(); i++) {
            if(arr[str.charAt(i)-'a'] == -1) {  //체크 여부
                arr[str.charAt(i)-'a'] = i;
            }
        }
        for(int i : arr) {
            System.out.print(i+" ");
        }

        br.close(); //입력버퍼 닫기
    }
}