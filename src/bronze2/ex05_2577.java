package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex05_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 1;
        for (int i = 0; i < 3; i++) {
            result *= Integer.parseInt(br.readLine());
        }
        char[] arr = String.valueOf(result).toCharArray();

        int[] resultArr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int temp = Integer.parseInt(String.valueOf(arr[i]));
            resultArr[temp]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(resultArr[i]);
        }
    }
}
