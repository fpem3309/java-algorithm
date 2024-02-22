package intro.sec06;

import java.util.Scanner;

public class ex10_11948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 100;

        for (int i = 0; i < 4; i++) {
            int test = sc.nextInt();
            sum += test;
            if (test < min) min = test;
        }
        sum -= min;

        int E = sc.nextInt();
        int F = sc.nextInt();
        sum += Math.max(E, F);

        System.out.println(sum);
    }
}
