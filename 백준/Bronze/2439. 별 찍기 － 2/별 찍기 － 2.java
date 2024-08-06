import java.io.*;

class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        br.close(); //입력을 닫는다.

        for(int i=1; i<=T; i++){
            for(int j=1; j<=T-i; j++) {
                bw.write(" ");
            }
            for(int k=1; k<=i; k++){
                bw.write("*");

            }
            bw.write("\n");
        }
        bw.flush(); //스트림 비우기
        bw.close(); //스트림(출력)을 닫는다
    }
}