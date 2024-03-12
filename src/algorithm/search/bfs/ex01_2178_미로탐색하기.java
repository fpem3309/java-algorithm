package algorithm.search.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2178
 */
public class ex01_2178_미로탐색하기 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] a;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(line.substring(j, j + 1));
            }
        }
        BFS(0, 0);
        System.out.println(a[n - 1][m - 1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});   // x,y값 넣어둠
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();   // 현재 자리

            for (int k = 0; k < 4; k++) {   // 상하좌우 탐색
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if (x >= 0 && y >= 0 && x < n && y < m) {   // 배열 넘어가면 x
                    if (a[x][y] != 0 && !visited[x][y]) {    // 0이면 x, 방문한 곳x
                        visited[x][y] = true;   // 갈 수 있는 곳(false) -> 방문 처리(true)
                        a[x][y] = a[now[0]][now[1]] + 1;  // ✨ 이동 자리 값 = 직전 자리 + 1의 데이터를 넣어준다
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}