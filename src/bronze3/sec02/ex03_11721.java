package bronze3.sec02;

import java.util.Scanner;

public class ex03_11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i += 10) {
            String temp;
            if (i + 10 < s.length()) temp = s.substring(i, i + 10);
            else temp = s.substring(i);
            System.out.println(temp);
        }
    }
}
