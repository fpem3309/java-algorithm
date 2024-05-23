package silver.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/1439
 */
public class ex01_1439_뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int split0Cnt = 0, split1Cnt = 0;
        String[] split0 = s.split("0");
        String[] split1 = s.split("1");

        for (String string : split0) {
            if (!string.isEmpty()) split0Cnt++;
        }
        for (String string : split1) {
            if (!string.isEmpty()) split1Cnt++;
        }
        System.out.println(Math.min(split0Cnt, split1Cnt));
    }
}
