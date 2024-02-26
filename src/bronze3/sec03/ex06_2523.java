package bronze3.sec03;

import java.util.Scanner;

public class ex06_2523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= n && i > j || i > n && i + j < 2*n) System.out.print("*");
            }
            System.out.println();
        }
    }
}