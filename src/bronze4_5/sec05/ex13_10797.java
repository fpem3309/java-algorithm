package bronze4_5.sec05;

import java.util.Scanner;

public class ex13_10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            if(N == sc.nextInt()) cnt++;
        }
        System.out.println(cnt);
    }
}
