package intro.sec05;

import java.util.Scanner;

public class ex08_3046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R1 = sc.nextInt();
        int S = sc.nextInt();

        /**
         * (R1 + R2)/2 = S
         * R1 + R2 = S*2
         * R2 = S*2 - R1
         */
        int R2 =  S*2 - R1;
        System.out.println(R2);

    }
}
