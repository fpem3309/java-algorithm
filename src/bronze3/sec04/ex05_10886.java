package bronze3.sec04;

import java.util.Scanner;

public class ex05_10886 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int vote = sc.nextInt();
            if (vote == 1) cnt++;
        }
        if (cnt > n / 2) System.out.println("Junhee is cute!");
        else System.out.println("Junhee is not cute!");
    }
}
