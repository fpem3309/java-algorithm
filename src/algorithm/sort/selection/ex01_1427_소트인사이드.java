package algorithm.sort.selection;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1427
 */
public class ex01_1427_소트인사이드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int length = text.length();
        int[] a = new int[length];

        for (int i = 0; i < length; i++) {
            a[i] = Integer.parseInt(text.substring(i, i + 1));
        }

        // 선택 정렬
        for (int i = 0; i < length; i++) {
            int max = i;
            for (int j = i + 1; j < length; j++) {
                if (a[j] > a[max]) max = j;
            }
            if(a[max] > a[i]){
                int temp = a[i];
                a[i] = a[max];
                a[max] = temp;
            }
        }
        for (int x : a) {
            System.out.print(x);
        }
    }
}
