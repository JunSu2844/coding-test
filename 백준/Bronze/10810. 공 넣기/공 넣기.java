
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


        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());			 // StringTokenizer로 " "(공백)으로 구분

            int I = Integer.parseInt(st.nextToken()); //1번 바구니에서
            int J = Integer.parseInt(st.nextToken()); //2번 바구니까지
            int K = Integer.parseInt(st.nextToken()); //넣을 번호

            for(int j = I - 1; j < J; j++) {  //I-1는 가장 첫음 바구니에는 공이 없으니 빈 배열, 2번(J)까지
                arr[j] = K; //I-1부터 J까지 바구니에 번호(k)를 덮어 씌운다.
            }
        }
        for(int k = 0; k < arr.length; k++) {
            bw.write(arr[k] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}