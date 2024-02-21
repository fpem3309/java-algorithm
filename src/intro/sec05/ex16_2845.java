package intro.sec05;

import java.util.Scanner;

public class ex16_2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int P = sc.nextInt();
        int result = L * P;

        for (int i = 0; i < 5; i++) {
            int temp = sc.nextInt();
            System.out.print(temp - result + " ");
        }
    }
}
