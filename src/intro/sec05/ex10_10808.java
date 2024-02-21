package intro.sec05;

import java.util.Scanner;

public class ex10_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Alphabet = new int[26];
        char[] charArray = sc.next().toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            Alphabet[(int) charArray[i] - 97]++;
        }

        for (int i = 0; i < Alphabet.length; i++) {
            System.out.print(Alphabet[i] + " ");
        }
    }
}
