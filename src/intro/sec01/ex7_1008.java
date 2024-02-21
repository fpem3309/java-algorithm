package intro.sec01;

import java.util.Scanner;

public class ex7_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextInt();
        double B = sc.nextInt();

        // float - 소수점 9자리
        // double - 소수점 18자리
        System.out.println(A / B);
    }
}
