package algorithm.implementation;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10809
 */
public class ex01_10809_알파벳찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        int[] result = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        char[] alphabet = text.toCharArray();

        for (int i = 0; i < alphabet.length; i++) {
            int index = alphabet[i] - 97;
            if (result[index] == -1) result[index] = i;
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
