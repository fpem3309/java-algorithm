package bronze3.sec04;

import java.util.Scanner;

public class ex03_2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 100;

        for (int i = 0; i < 7; i++) {
            int n = sc.nextInt();
            if (n % 2 == 1) {
                sum += n;
                if (n < min) min = n;
            }
        }

        if (sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
