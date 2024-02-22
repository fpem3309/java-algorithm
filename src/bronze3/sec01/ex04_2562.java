package bronze3.sec01;

import java.util.Scanner;

public class ex04_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int max_idx = 0;

        for (int i = 1; i <= 9; i++) {
            int temp = sc.nextInt();
            if (temp > max){
                max = temp;
                max_idx = i;
            }
        }
        System.out.println(max);
        System.out.println(max_idx);
    }
}