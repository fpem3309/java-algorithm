package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * https://www.acmicpc.net/problem/11399
 */
public class ex03_11399_ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] line = new int[n];
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            line[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(line);
        for (int i = 0; i < n; i++) {
            result += line[i] * (n - i);
        }
        System.out.println(result);
    }
}

/*
1           1*5
1 2         2*4
1 2 3       3*3
1 2 3 3     3*2
1 2 3 3 4   4*1
 */