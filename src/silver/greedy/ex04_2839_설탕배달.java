package silver.greedy;

import java.util.Scanner;
/**
 * https://www.acmicpc.net/problem/2839
 */
public class ex04_2839_설탕배달 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bag = 0;

        if (n % 5 == 0) {   // 5로 딱 맞으면 최소값
            bag = n / 5;
        } else {
            while (n > 0) {
                n -= 3; // 3씩 빼기
                bag++;  // 가방 하나 추가

                if (n % 5 == 0) {  // 3을 몇번 빼고 5로 나눠지면 최소값
                    bag += n / 5; // 5씩 빼기
                    break;
                } else if (n == 1 || n == 2) {  // 3으로도 못 나누게 1 또는 2면 -1
                    bag = -1;
                    break;
                }
            }
        }
        System.out.println(bag);
    }
}