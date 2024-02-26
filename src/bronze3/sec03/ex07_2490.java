package bronze3.sec03;

import java.util.Scanner;

public class ex07_2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int b = 0;
            for (int j = 0; j < 4; j++) {
                int temp = sc.nextInt();
                if (temp == 0) b++;
            }
            if (b == 0) System.out.println("E");
            else System.out.println((char) (b + 64));
        }
    }
}