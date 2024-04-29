package algorithm.implementation;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1316
 */
public class ex02_1316_그룹단어체커 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int[] alphabet = new int[26];
            char[] words = sc.next().toCharArray();
            boolean flag = false;

            for (int j = 0; j < words.length; j++) {
                int x = words[j] - 97;

                if (j > 0) {
                    if (alphabet[x] > 0 && (words[j] != words[j - 1])) {
                        flag = false;
                        break;
                    }
                }
                alphabet[x]++;
                flag = true;
            }
            if (flag) cnt++;
        }
        System.out.println(cnt);
    }
}
