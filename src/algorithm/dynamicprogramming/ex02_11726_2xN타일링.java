package algorithm.dynamicprogramming;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11726
 */
public class ex02_11726_2xN타일링 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] tiles = new long[1001];
        tiles[1] = 1;   // N = 1일때 타일 채우는 경우의 수
        tiles[2] = 2;   // N = 1일때 타일 채우는 경우의 수

        for (int i = 3; i <= n; i++) {
            tiles[i] = (tiles[i-1] + tiles[i-2]) % 10007;
        }
        System.out.println(tiles[n]);
    }
}
