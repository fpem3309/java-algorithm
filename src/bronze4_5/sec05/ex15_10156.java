package bronze4_5.sec05;

import java.util.Scanner;

public class ex15_10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();

        if (K * N > M) System.out.println(K * N - M);
        else System.out.println(0);
    }
}
