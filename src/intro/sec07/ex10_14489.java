package intro.sec07;

import java.util.Scanner;

public class ex10_14489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt() + sc.nextInt();
        int C = sc.nextInt() * 2;

        if (total < C) System.out.println(total);
        else System.out.println(total - C);
    }
}
