package bronze3.sec04;

import java.util.Scanner;

public class ex09_2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int point = 2;
        for (int i = 1; i <= n; i++) {
            point = 2 * point - 1;
        }
        System.out.println(point * point);
    }
}