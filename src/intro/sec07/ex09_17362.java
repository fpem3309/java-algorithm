package intro.sec07;

import java.util.Scanner;

public class ex09_17362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() % 8;

        if(N==1) System.out.println(1);
        else if(N==0 || N==2) System.out.println(2);
        else if(N==3 || N==7) System.out.println(3);
        else if(N==4 || N==6) System.out.println(4);
        else System.out.println(5);
    }
}
