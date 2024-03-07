package algorithm.greedy;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1541
 */
public class ex02_1541_최솟값을만드는괄호배치찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        String a = sc.nextLine();
        String[] b = a.split("-");

        for (int i = 0; i < b.length; i++) {
            int part = mySum(b[i]);
            if (i == 0) result += part;
            else result -= part;
        }
        System.out.println(result);
    }

    private static int mySum(String s) {
        int sum = 0;
        String[] nums = s.split("\\+");
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}