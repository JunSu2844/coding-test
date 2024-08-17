

import java.io.*;
        import java.util.Arrays;
        import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] arr = new String[2]; //문자열 변수 선언(두개의 값을 받기 위해서)

        for(int i=0; i<arr.length; i++){
            arr[i] = st.nextToken(); //스페이스 기준으로 나누기 위해서 선언
            StringBuilder sb = new StringBuilder(arr[i]);
            // reverse() 함수를 선언하기 위해서 선언과 동시에 문자열 arr[i] 선언
            //String형으로 선언해야 하기 떄문에 문자열 배열로 만들었음
            //String 타입은 불변성을 가지는 클래스이다. 그래서 String 객체가 생성되면 그 값은 변하지 않고
            //"새로운 객체"로 추가 및 변경이 된다.
            // 이러한 경우를 위해서 StringBuffer 라는 가변한 문자열을 처리하는 클래스가 있다.
            //StringBuffer의 경우 새로운 값이 추가 되거나 변경하게 되면 "기존의 객체"로 추가 및 변경이 된다.

            arr[i] = String.valueOf(sb.reverse());
            //위에서 지정된 문자열을 뒤집는 함수 reverse()를 사용
            //여기서 핵심은 "StringBuulder 타입"으로 반환하는 것이다. String 타입이랑 다른 타입이 기때문에
            //arr[i] = sb.reverse()으로 하면 에러가 발생한다.
            //그래서 String.valueOf() 함수를 사용해서 String 타입으로 형 변환했다.
        }


        if(Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])) {
           System.out.println(arr[0]);
        }else {
            System.out.println(arr[1]);
        }
        
        //뒤집인 String 타입의 값을 비교하기 위해서 Integer.parseInt() 함수를 사용해서 int형으로 변환 후
        // 값을 비교 했다.

        br.close(); //입력스트림 닫기

    }
}