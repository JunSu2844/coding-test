
import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] num = new int[N];

        st = new StringTokenizer(br.readLine(), " "); // 두 번째 줄 입력을 위해 다시 선언


        for(int i=0; i<num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        for(int j=0; j<num.length; j++) {
            if(num[j] < X) {
                bw.write(num[j]+" ");
            }
        }

        br.close(); //입력스트림 닫는다.
        bw.flush(); //스트림 비우기
        bw.close(); //출력스트림 닫기
    }
}