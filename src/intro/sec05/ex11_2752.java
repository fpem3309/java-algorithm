package intro.sec05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex11_2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] A = new int[3];
        Integer[] A = new Integer[3];
        for (int i = 0; i < 3; i++) {
            A[i] = sc.nextInt();
        }
//        Arrays.sort(A); // 오름차순
        Arrays.sort(A, Collections.reverseOrder()); // 내림차순
        for (int i = 0; i < 3; i++) {
            System.out.print(A[i]+" ");
        }
    }
}
