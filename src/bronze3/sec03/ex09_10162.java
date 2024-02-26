package bronze3.sec03;

import java.util.Scanner;

public class ex09_10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();

        if (time % 10 != 0) System.out.println(-1);
        else System.out.print(time / 600 + " " + time % 600 / 60 + " " + time % 600 % 60 / 10);
    }
}