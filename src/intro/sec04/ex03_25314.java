package intro.sec04;

import java.util.Scanner;

public class ex03_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int repeat = N/4;

        for (int i = 0; i < N; i+=4) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
