package bronze3.sec04;

import java.util.Scanner;

public class ex08_10991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n + i - 1; j++) {
                if ((i + j + n) % 2 == 0 && (i + j) >= n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}