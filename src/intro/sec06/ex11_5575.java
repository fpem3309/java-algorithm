package intro.sec06;

import java.util.Scanner;

public class ex11_5575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int h_s = sc.nextInt();
            int m_s = sc.nextInt();
            int s_s = sc.nextInt();

            int h_e = sc.nextInt();
            int m_e = sc.nextInt();
            int s_e = sc.nextInt();

            int s = s_e - s_s;
            int m = m_e - m_s;
            int h = h_e - h_s;

            if (s < 0) {
                m--;
                s += 60;
            }
            if (m < 0) {
                h--;
                m += 60;
            }
            System.out.println(h + " " + m + " " + s);
        }
    }
}
