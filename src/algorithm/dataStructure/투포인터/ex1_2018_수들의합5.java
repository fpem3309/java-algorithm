package algorithm.dataStructure.투포인터;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2018
 */
public class ex1_2018_수들의합5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 수 N 입력
        int count = 1;  // 정답 카운트(자기자신 카운트 초기값1)
        int start_index = 1;    // 더하기 시작 인덱스
        int end_index = 1;  // 더하기 마지막 인덱스
        int sum = 1;    // 시작~마지막 더한 값

        while (end_index != N) {    // end_index 끝까지 가면 종료
            if(sum == N){
                count++;    // 카운트 +1
                end_index++;  // 마지막 인덱스 증가
                sum += end_index;   // sum 증가
            } else if (sum > N) {
                sum -= start_index;   // sum 감소
                start_index ++; // 시작 인덱스 증가해서 sum 감소시키기
            } else {
                end_index ++;   // 마지막 인덱스 증가해서 sum 증가시키기
                sum += end_index;   // sum 증가
            }
        }
        System.out.println(count);
    }
}
