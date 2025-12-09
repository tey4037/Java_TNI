
import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;

        while (true) {
            System.out.print("Input some sentence: ");
            sentence = sc.nextLine().trim();

            if (sentence.endsWith(".")) {
                break;
            } else {
                System.out.println("The sentence must end with full stop point: " + sentence + ".");
            }
        }

        String noDot = sentence.substring(0, sentence.length() - 1).trim();

        String[] words = noDot.split("\\s+");

        for (String w : words) {
            System.out.println(w);
        }
    }
}
