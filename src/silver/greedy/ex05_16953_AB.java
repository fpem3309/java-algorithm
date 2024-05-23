package silver.greedy;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/16953
 */
public class ex05_16953_AB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 1;

        while (a < b) {
            if (b % 10 == 1) {    // 방법2
                b = b / 10;
            } else if (b % 2 == 0) {    // 방법 1
                b = b / 2;
            } else {
                break;
            }
            cnt++;
        }
        System.out.println(a == b ? cnt : -1);
    }
}