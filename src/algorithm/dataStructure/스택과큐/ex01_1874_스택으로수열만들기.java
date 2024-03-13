package algorithm.dataStructure.스택과큐;

import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/1874
 */
public class ex01_1874_스택으로수열만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int stack_latest = 1;
        boolean result = true;
        StringBuffer bf = new StringBuffer();

        for (int i = 0; i < n; i++) {
            int su = a[i];  // 수열
            if (su >= stack_latest) {
                while (su >= stack_latest) {    // 현재 수열이 될때까지 stack에 push
                    stack.push(stack_latest++);
                    bf.append("+\n");
                }
                stack.pop();    // 하나 pop
                bf.append("-\n");
            } else {    // 현재 수열이 더 작다면 하나씩 pop
                int s = stack.pop();
                if (s > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if (result) System.out.println(bf);
    }
}