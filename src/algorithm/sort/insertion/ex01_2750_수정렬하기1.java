package algorithm.sort.insertion;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2750
 */
public class ex01_2750_수정렬하기1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // 삽입 정렬
        for (int i = 1; i < n; i++) {
            int key = nums[i];  // 선택한 데이터
            int j = i - 1;  // 1칸 앞 숫자부터 비교
            while (j >= 0 && nums[j] > key) {    // 0번째까지 비교해서 key보다 크면
                nums[j + 1] = nums[j];  // 한 칸 미뤄서 저장
                j--;    // 앞으로 한칸
            }
            nums[j + 1] = key;
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }
}