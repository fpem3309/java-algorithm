package intro.sec07;

import java.util.Scanner;

public class ex08_4299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (B > A) System.out.println("-1");
        else {
            int x = (A + B) / 2;
            int y = (A - B) / 2;
            if (x + y == A && x - y == B) {
                System.out.println(x + " " + y);
            } else {
                System.out.println("-1");
            }
        }
    }
}
