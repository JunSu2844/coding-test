
import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;

        if( str.length() <= N) {
            for(int i=0; i<str.length(); i++) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(sum);

        br.close();
    }
}