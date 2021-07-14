import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        Scanner input = new Scanner(System.in);
        int number = 1;
        
        while (number != 66) {
            
        System.out.println("Insert positive integers");
        number = Integer.valueOf(input.nextLine());
            

            if (number <= 0) {
                System.out.println("Unfit number! Try again.");
                continue;
            }
            System.out.println("Your input was " + number);
        }

    }
    
    
}
