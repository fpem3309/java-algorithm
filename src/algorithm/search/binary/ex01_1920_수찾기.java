package algorithm.search.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1920
 */
public class ex01_1920_수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a); // ❗이진 탐색을 위해 정렬

        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken()); // 찾아야 하는 값

            // ✨이진 탐색 시작
            int start = 0;  // 시작 인덱스(맨 처음)
            int end = a.length - 1; // 종료 인덱스(맨 끝)
            int is_find = 0;   // 찾았는지 판단

            while (start <= end) {
                int mid = (end + start) / 2; // 중간 인덱스 설정
                int mid_val = a[mid];
                if (target > mid_val) {
                    start = mid + 1;    // ❗현재 중간값 보다 큰 범위로
                } else if (target < mid_val) {
                    end = mid - 1;      // ❗현재 중간값 보다 작은 범위로
                } else {
                    is_find = 1;  // ❗ 찾음!
                    break;
                }
            }
            System.out.println(is_find);
        }
    }
}
