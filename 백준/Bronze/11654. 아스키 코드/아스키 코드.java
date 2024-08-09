
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = br.readLine().charAt(0);

        bw.write((byte)N + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}