
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];
        double sum = 0.0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            sum += (arr[i]/arr[arr.length-1]) * 100.0;
        }

        bw.write(sum/arr.length+"\n");


        br.close();
        bw.flush();
        bw.close();
    }
}