package bronze3.sec01;

import java.util.Scanner;

public class ex05_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        B += C;
        if (B >= 60) {
            A += (B/60);
            B = (B%60);
        }
        if (A >= 24) A -= 24;
        System.out.println(A + " " + B);
    }
}