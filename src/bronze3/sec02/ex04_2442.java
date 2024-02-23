package bronze3.sec02;

import java.util.Scanner;

public class ex04_2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        /*
        for (int i = 0; i < N; i++) {
            for (int j = N-1; j >= 0; j--) {
                if (i >= j) System.out.print("*");
                else System.out.print(" ");
            }
            for (int j = 1; j < N; j++) {
                if (i >= j) System.out.print("*");
            }
            System.out.println();
        }
        */

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N + i; j++) {
                if (N - i - j <= 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}