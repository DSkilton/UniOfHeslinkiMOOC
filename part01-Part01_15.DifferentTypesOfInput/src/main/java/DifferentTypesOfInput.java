
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string: ");
        String strInput = scan.nextLine();
        
        System.out.println("Give an integer: ");
        int iInput = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double: ");
        double dInput = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean: ");
        boolean bInput = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + strInput);
        System.out.println("You gave the integer " + iInput);
        System.out.println("You gave the double " + dInput);
        System.out.println("You gave the boolean " + bInput);

    }
}
