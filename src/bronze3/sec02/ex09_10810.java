package bronze3.sec02;

import java.util.Scanner;

public class ex09_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] bucket = new int[N+1];

        for (int l = 0; l < M; l++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int m = i; m <= j; m++) {
                bucket[m] = k;
            }
        }

        for (int l = 1; l < N+1; l++) {
            System.out.print(bucket[l] + " ");
        }
    }
}