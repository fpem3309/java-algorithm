package bronze3.sec04;

import java.util.Scanner;

public class ex01_2522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n && i + j >= n - 1 || i >= n && i - j < n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*
i       j
0   01  2
1   0   12
2       012
3   0   12
4   01  2
*/
