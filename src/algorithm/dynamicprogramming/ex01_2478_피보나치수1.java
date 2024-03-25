package algorithm.dynamicprogramming;

import java.util.Scanner;
/**
 * https://www.acmicpc.net/problem/2478
 */
public class ex01_2478_피보나치수1 {
    static long[] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nums = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            nums[i] = -1;
        }
        nums[0] = 0;
        nums[1] = 1;

        fibo(n);
        System.out.println(nums[n]);
    }

    static long fibo(int n) {
        if (nums[n] != -1) return nums[n];
        return nums[n] = fibo(n - 1) + fibo(n - 2);
    }
}
