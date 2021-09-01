
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayWords;

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }

            arrayWords = userInput.split(" ");

            for (String word : arrayWords) {
                System.out.println(word);
            }
        }

    }
}
