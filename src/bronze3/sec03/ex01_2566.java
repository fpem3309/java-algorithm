package bronze3.sec03;

import java.util.Scanner;

public class ex01_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int x = 1, y = 1;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int n = sc.nextInt();
                if (n > max) {
                    max = n;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
