import java.util.Scanner;

public class PangramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        boolean[] lettersFound = new boolean[26];

        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = Character.toLowerCase(ch) - 'a';
                if (index >= 0 && index < 26) {
                    lettersFound[index] = true;
                }
            }
        }

        for (boolean found : lettersFound) {
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
