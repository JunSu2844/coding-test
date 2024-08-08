
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); // StringTokenizer로 N과 M, " "(공백)으로 구분

        int N = Integer.parseInt(st.nextToken()); //도현의 바구니
        int[] arr = new int[N];
        int M = Integer.parseInt(st.nextToken()); //M번 공(for문 반복 횟수)
        int b = 0;


        for(int i=0; i<N; i++) {
            arr[i] = i+1;
        }
        for(int j=0; j<M; j++) {
            st = new StringTokenizer(br.readLine());			 // StringTokenizer로 " "(공백)으로 구분

            int I = Integer.parseInt(st.nextToken())-1; //1번 바구니에서
            int J = Integer.parseInt(st.nextToken())-1; //2번 바구니까지

            b = arr[I];
            arr[I] = arr[J];
            arr[J] = b;
        }
        for(int k = 0; k<arr.length; k++) {
            bw.write(arr[k]+" ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}