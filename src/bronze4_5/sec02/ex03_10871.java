package bronze4_5.sec02;

import java.util.Scanner;

public class ex03_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            if (A < X) {
                System.out.print(A+" ");
            }
        }
    }
}
