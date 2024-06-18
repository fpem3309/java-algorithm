package bronze2;


import java.util.Scanner;

public class ex09_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            boolean isTrue = true;

            if (temp == 1) isTrue = false;
            else {
                // 1보다 크면서 약수가 자신 뿐
                for (int j = 2; j < Math.sqrt(temp); j++) { // ✨제곱근 까지만 반복
                    if (temp % j == 0) {
                        isTrue = false;
                        break;
                    }
                }
            }
            if (isTrue) cnt++;
        }
        System.out.println(cnt);
    }
}
