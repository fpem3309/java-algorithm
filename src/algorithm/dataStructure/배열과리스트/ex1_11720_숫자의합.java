package algorithm.dataStructure.배열과리스트;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11720
 */
public class ex1_11720_숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // N값 입력받기
        String sNum = sc.next();    // N 길이의 숫자

        char[] cNum = sNum.toCharArray();  // String -> char[]
        int sum = 0;    // 합을 저장할 변수

        for (int i = 0; i < N; i++) {
            sum += cNum[i] - '0'; // sum에 값 누적하기 ( ASCII CODE - 48 or - '0')
        }
        System.out.println(sum);
    }
}
