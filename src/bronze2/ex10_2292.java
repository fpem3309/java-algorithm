package bronze2;

import java.util.Scanner;

public class ex10_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int now = 1;
        int step = 1;

        while (n > now) {
            now += step * 6;
            step++;
        }
        System.out.println(step);
    }
}
