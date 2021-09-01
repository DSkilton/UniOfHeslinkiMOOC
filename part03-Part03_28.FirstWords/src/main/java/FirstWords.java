
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }// end of if
            
            String[] column = input.split(" ");
            System.out.println(column[0]);
        }// end of while loop        
    }// end of main
}// end of class
