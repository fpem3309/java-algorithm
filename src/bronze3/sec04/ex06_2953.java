package bronze3.sec04;

import java.util.Scanner;

public class ex06_2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int max = 0;
        int index = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                int score = sc.nextInt();
                scores[i] += score;
            }
            if (scores[i] > max) {
                max = scores[i];
                index = i + 1;
            }
        }
        System.out.println(index + " " + max);
    }
}
