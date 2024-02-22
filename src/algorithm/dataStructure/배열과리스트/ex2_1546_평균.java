package algorithm.dataStructure.배열과리스트;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1546
 */
public class ex2_1546_평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 과목 수 N 입력
        int[] A = new int[N];   // 길이가 N인 배열
        long sum = 0;   // 합계
        long max = 0;   // 최대점수

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();    // 각 점수 저장
        }
        for (int i = 0; i < N; i++) {
            if (A[i] > max) max = A[i];  // 최대점수 저장
            sum += A[i];    // 합계 누적
        }

        // 과목 점수 합(sum) * 100 / 최대점수(max) / 과목수
        System.out.println(sum * 100.0 / max / N);
    }
}
