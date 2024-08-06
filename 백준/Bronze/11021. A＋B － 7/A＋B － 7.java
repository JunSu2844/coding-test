import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int T = Integer.parseInt(br.readLine());

    for(int i=1; i<=T; i++){
        st = new StringTokenizer(br.readLine());
        bw.write(String.format("Case #%d: %d \n", i, (Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()) ) ));
       }

    bw.close();
    }
}