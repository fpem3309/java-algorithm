package intro.sec04;

import java.util.Scanner;

public class ex09_4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == 0 && B == 0) break;
            else if (A > B) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
