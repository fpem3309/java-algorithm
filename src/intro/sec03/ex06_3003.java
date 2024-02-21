package intro.sec03;

import java.util.Scanner;

public class ex06_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int a = sc.nextInt();
            System.out.print(A[i] - a+" ");
        }
    }
}
