package bronze4_5.sec03;

import java.util.Scanner;

public class ex02_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fact = 1;
        if (N > 1) {
            for (int i = 1; i <= N; i++) {
                fact *= i;
            }
        }
        System.out.println(fact);
    }
}
