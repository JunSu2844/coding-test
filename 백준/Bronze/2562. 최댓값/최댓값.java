
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int index=0;
        int max = arr[0];

        for(int i=0; i<arr.length; i++) {
            //StringTokenizer st = new StringTokenizer(br.readLine());
            //arr[i] = Integer.parseInt(st.nextToken());
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]) {
                max = arr[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);

        br.close(); //입력스트림 닫는다.

    }
}