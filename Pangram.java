import java.util.Scanner;

public class Pangram {

    public static int isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        boolean[] alphabet = new boolean[26];
        int len = sentence.length();

        for (int i = 0; i < len; i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                return -1;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        int result = isPangram(sentence);
        System.out.println(result);
    }
}
