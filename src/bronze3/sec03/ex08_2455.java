package bronze3.sec03;

import java.util.Scanner;

public class ex08_2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int total = 0;
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b == 0) break;
            total = total - a + b;
            if (total > max) max = total;
        }
        System.out.println(max);
    }
}