package bronze3.sec04;

import java.util.Scanner;

public class ex07_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.nextLine().toCharArray();
        boolean flag = true;
        for (int i = 0; i < text.length / 2; i++) {
            flag = text[i] == text[text.length - 1 - i];
            if(!flag) break;
        }
        System.out.println(flag ? 1 : 0);
    }
}
