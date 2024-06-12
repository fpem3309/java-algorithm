package bronze2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex03_10809 {
    public static void main(String[] args) throws IOException {
        int[] alphabet = new int[26];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] text = br.readLine().toCharArray();

        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }

        for (int i = 0; i < text.length; i++) {
            int indexNum = text[i] - 97;
            if (alphabet[indexNum] == -1) {
                alphabet[indexNum] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
