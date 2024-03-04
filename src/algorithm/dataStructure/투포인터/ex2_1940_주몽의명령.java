package algorithm.dataStructure.투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1940
 */
public class ex2_1940_주몽의명령 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());   // 재료의 개수 N
        int M = Integer.parseInt(br.readLine());   // 갑옷이 되는 번호 M
        int count = 0;  // 정답 카운트
        int start_index = 0;    // 더하기 시작 인덱스
        int end_index = N - 1;  // 더하기 마지막 인덱스
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        while (start_index < end_index) {    // end_index 끝까지 가면 종료
            int sum = arr[start_index] + arr[end_index];
            if (sum < M)    start_index++;
            else if (sum > M)   end_index--;
            else {
                count++;
                start_index++;
                end_index--;
            }
        }
        System.out.println(count);
    }
}
