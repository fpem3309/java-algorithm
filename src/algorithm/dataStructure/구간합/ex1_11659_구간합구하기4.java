package algorithm.dataStructure.구간합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11659
 */
public class ex1_11659_구간합구하기4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());   // 수의 개수 N
        int M = Integer.parseInt(stringTokenizer.nextToken()); //   합을 구해야 하는 횟수 M
        long[] S = new long[N + 1]; // 합배열

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= N; i++) {
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());  // 합배열 값 넣기
        }

        for (int q = 0; q < M; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());   // 구간 i
            int j = Integer.parseInt(stringTokenizer.nextToken());   // 구간 j

            System.out.println(S[j] - S[i-1]);
        }

    }
}
