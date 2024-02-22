package bronze3.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class ex06_10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}