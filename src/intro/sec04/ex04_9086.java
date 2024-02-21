package intro.sec04;

import java.util.Scanner;

public class ex04_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String text = sc.nextLine();
            String result = text.substring(0, 1) + text.substring(text.length() - 1);
            System.out.println(result);
        }
    }
}
