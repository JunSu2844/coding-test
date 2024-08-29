
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (checkstr(br.readLine())) {  //하나씩 문자열을 읽어서 검사 후 통과하면
                count++;                    //count++ 증가
            }
        }

        br.close(); //입력스트림 닫기
        System.out.println(count); //단어 갯수 출력
    }
    static boolean checkstr(String str) {
        boolean[] ck = new boolean[26]; //입려받은 문자열의 확인 하기 위해서 알파벳 갯수 배열
        int prev = -1; //이전 값 저장 변수

        for(int i=0; i<str.length(); i++) {
            int now = str.charAt(i);    //현자 문자열의 한 문자를 now 변수에 저장

            if(prev != now) {
                if(ck[now-'a'] == false) { //false라는건 기존에 한번도 나온적 없다는 의미
                    ck[now-'a'] = true; //문자가 처음 나온거라는 확인했으니,
                                            // 다음에 나오면 두번째로 나온 문자라는 의미라서 true로 변경
                    prev = now; //다음 문자랑 비교하기 위해서 현재 문자를 저장
                }else {     //false가 아니라는 의미는 그룹문자가 아니라는 의미
                    return false;   //더이상 반복문 할 필요가 없기 때문에 반환함
                }
            }else { //이전 문자랑 같다면 같은 문자가 나온거라서 넘어가고 계속한다.
                continue;
            }
        }

        return true;    //여기까지 아무 문제가 없다는 의미는 그룹문자라는 의미라 true 반환
    }
}