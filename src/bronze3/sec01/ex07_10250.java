package bronze3.sec01;

import java.util.Scanner;

public class ex07_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int floor = N % H;
            int ho = N / H;

            if (floor == 0) {
                floor = H;
            }else{
                ho++;
            }

            if (ho < 10) System.out.println(floor + "0" + ho);
            else System.out.println(floor + "" + ho);

        }
    }
}