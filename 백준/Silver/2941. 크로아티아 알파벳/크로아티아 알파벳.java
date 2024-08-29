
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] croatiaAlphabet = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        int index = 0;

        for(int i=0; i< croatiaAlphabet.length; i++) {
            index = s.indexOf(croatiaAlphabet[i]);
            if(index >= 0) {
                s = s.replaceAll(croatiaAlphabet[i], "A");
            }
        }
        System.out.println(s.length());

        br.close(); //입력스트림 닫기

    }
}