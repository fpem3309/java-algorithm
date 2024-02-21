package intro.sec04;

import java.util.Scanner;

public class ex10_2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 32차이
//        System.out.println((int)'A');
//        System.out.println((int)'a');

        char[] charArray = sc.nextLine().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char temp = charArray[i];
            if (temp >= 'a' && temp <= 'z') {
                System.out.print((char)(temp - 32));
            } else {
                System.out.print((char)(temp + 32));
            }
        }
    }
}
