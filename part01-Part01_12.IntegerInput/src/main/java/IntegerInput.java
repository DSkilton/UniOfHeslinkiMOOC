
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        
        System.out.println("Give a number:");
        input = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + input);
        
        input = scanner.nextInt(); 
        System.out.println("You gave the number " + input);

    }
}
