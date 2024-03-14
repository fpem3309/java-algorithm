package algorithm.dataStructure.스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * https://www.acmicpc.net/problem/11286
 */
public class ex03_11286_절댓값힙구현 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // ✨우선순위 큐 선언
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
            // ✨절댓값 기준으로 정렬되도록 설정

            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            // ❗절댓값이 같으면 음수 우선 정렬
            if (first_abs == second_abs) {
                return o1 > o2 ? 1 : -1;
            }
            // ❗절댓값 작은 데이터 우선
            return first_abs - second_abs;
        });

        for (int i = 0; i < n; i++) {
            int request = Integer.parseInt(br.readLine());
            if (request == 0) {
                if (myQueue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(myQueue.poll());
                }
            } else {
                myQueue.offer(request);
            }
        }
    }
}