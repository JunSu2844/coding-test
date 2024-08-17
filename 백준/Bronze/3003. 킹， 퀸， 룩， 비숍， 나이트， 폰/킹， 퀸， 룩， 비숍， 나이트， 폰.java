
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[6];

        for(int i=0; i<arr.length; i++) {
          arr[i] = Integer.parseInt(st.nextToken());
        }
        arr[0] = 1-arr[0];
        arr[1] = 1-arr[1];
        arr[2] = 2-arr[2];
        arr[3] = 2-arr[3];
        arr[4] = 2-arr[4];
        arr[5] = 8-arr[5];

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        br.close(); //입력스트림 닫기

    }
}