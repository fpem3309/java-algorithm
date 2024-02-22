package intro.sec06;

import java.util.Scanner;

public class ex01_1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String text = sc.nextLine();
            if (text.equals("#")) break;

            char[] charArray = text.toCharArray();
            int cnt = 0;

            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u' ||
                        charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I' || charArray[i] == 'O' || charArray[i] == 'U') {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
