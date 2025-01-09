/* do it 003번 문제 : 구간 합 구하기
    실버 5
    이 문제의 경우 시간 복잡도 최악을 가정 했 을 때 n < 100,000이고 질의 질문도 n < 100,000이다.
    일려 경우 100,000 * 100,000 경우 1억을 넘어가게 되면서 시간 제한 시간 : 0.5를 넘을 수 있다.
    그래서 Scanner() 함수보다 bufferedReader 를 사용한다. 이거 더 빠르다.
*
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long[] s = new long[suNo + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= suNo; i++) {
            s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(s[j] - s[i - 1]);
        }
        bufferedReader.close();
    }
}
