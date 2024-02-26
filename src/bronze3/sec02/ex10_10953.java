package bronze3.sec02;

import java.util.Scanner;

public class ex10_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String[] text = sc.next().split(",");
            int A = Integer.parseInt(text[0]);
            int B = Integer.parseInt(text[1]);
            System.out.println(A+B);
        }
    }
}