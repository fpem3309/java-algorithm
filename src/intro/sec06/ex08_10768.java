package intro.sec06;

import java.util.Scanner;

public class ex08_10768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();

        if(M < 2 || (M==2 && D < 18)) System.out.println("Before");
        else if (M == 2 && D == 18) System.out.println("Special");
        else System.out.println("After");
    }
}
