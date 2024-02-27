package bronze3.sec04;

import java.util.Scanner;

public class ex10_5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();

        for (int i = 0; i < 9; i++) {
            int n = sc.nextInt();
            result -= n;
        }
        System.out.println(result);
    }
}