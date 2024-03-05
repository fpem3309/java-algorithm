package algorithm.dataStructure.슬라이딩윈도우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/12891
 */
public class ex2_12891_DNA비밀번호 {
    static int[] myArr;
    static int[] checkArr;
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int result = 0;
        myArr = new int[4];
        checkArr = new int[4];
        checkSecret = 0;    // 4개를 만족하면 성공

        char[] a = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) checkSecret++;  // 0이면 0인 부분은 무조건 성공 -> +1
        }

        for (int i = 0; i < p; i++) {   // 처음 문자열 세팅 0 ~ p-1
            Add(a[i]);
        }
        if (checkSecret == 4) result++;

        // 슬라이딩 윈도우
        for (int i = p; i < s; i++) {   // i = 두번째부터는 부분문자열의 길이 인덱스 까지(뒤 인덱스가 한 칸 움직인 효과)
            int j = i - p;    // j = 두번째부터는 맨 뒤 인덱스 - 부분문자열의 길이 부터(앞 인덱스가 한 칸 움직인 효과)
            Add(a[i]);  // 맨 뒤 다음 인덱스 단어 추가 검색
            Remove(a[j]);   // 맨 앞 인덱스 단어 삭제
            if (checkSecret == 4) result++;
        }
        System.out.println(result);
        br.close();
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }
}
