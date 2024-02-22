package bronze3.sec01;

import java.util.Scanner;

public class ex01_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        char[] charArray = sc.next().toCharArray();
        int sum = 0;
        int su = 1;
        for (int i = 2; i >= 0; i--) {
            int temp = Integer.parseInt(String.valueOf(charArray[i]));
            System.out.println(A * temp);
            sum += (A * temp) * su;
            su *= 10;
        }
        System.out.println(sum);
    }
}
