
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] arr = new int[10];
        int count = 0;
        boolean b;

        for(int i=0; i<arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken()) % 42;
        }
        for(int j=0; j<arr.length; j++) {
            b = false;
            for(int k=j+1; k<arr.length; k++) {
                if(arr[j] == arr[k]) {
                    b = true;
                    break;
                }
            }
            if(b == false){
                count++;
            }

        }
        bw.write(count+"\n");

        br.close();
        bw.flush();
        bw.close();
    }
}