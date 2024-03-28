package algorithm.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2960
 */
public class ex01_2960_에러토스테네스의체 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = 0;
        int cnt = 0;

        // 2~N까지 모든 정수를 적는다
        int[] a = new int[n + 1];
        for (int i = 2; i < a.length; i++) {
            a[i] = i;
        }

        for (int i = 2; i < a.length; i++) {
            // 아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것은 p, 소수다
            if (a[i] > 1) {
                p = a[i];
            }

            for (int j = i; j < a.length; j+=i) {
                // p를 지우고 아직 지우지 않은 p의 배수를 크기 순서대로 지운다
                if (a[j] % p == 0) {
                    cnt++;
                    if (cnt == k) {
                        System.out.println(a[j]);
                        break;
                    }
                    a[j] = -1;
                }
            }
        }
    }
}