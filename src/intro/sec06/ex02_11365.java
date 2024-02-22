package intro.sec06;

import java.util.Scanner;

public class ex02_11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String text = sc.nextLine();
            if (text.equals("END")) break;

            char[] charArray = text.toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--) {
                System.out.print(charArray[i]);
            }
            System.out.println();
        }

    }
}
