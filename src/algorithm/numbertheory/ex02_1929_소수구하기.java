package algorithm.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1929
 */
public class ex02_1929_소수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] a = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            a[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (a[i] == 0) continue;
            for (int j = i + i; j <= n; j = j + i) {
                a[j] = 0;
            }
        }
        for (int i = m; i <= n; i++) {
            if (a[i] != 0) System.out.println(a[i]);
        }
    }
}