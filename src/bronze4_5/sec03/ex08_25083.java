package bronze4_5.sec03;

import java.util.Scanner;

public class ex08_25083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[201];
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int index = sc.nextInt();
            A[index + 100]++;
        }
        int V = sc.nextInt();
        System.out.println(A[V + 100]);
    }
}
