import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=t; i++) {
            sum += i;
        }
        System.out.println(sum);


    }
}