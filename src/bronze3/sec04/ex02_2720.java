package bronze3.sec04;

import java.util.Scanner;

public class ex02_2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int c = sc.nextInt();
            int q, d, n, p;
            q = c / 25; c %= 25;
            d = c / 10; c %= 10;
            n = c / 5;  c %= 5;
            p = c;

            System.out.println(q+" "+d+" "+n+" "+p);
        }
    }
}
