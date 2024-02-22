package bronze3.sec01;

import java.util.Scanner;

public class ex02_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M < 45) {
            if (H < 1) {
                H = 24;
            }
            H--;
            M += 60;
        }
        M -= 45;
        System.out.println(H + " " + M);
    }
}
