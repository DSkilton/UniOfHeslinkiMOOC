
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0, input;
        
        do{
            System.out.println("Give a number:");
            input = scanner.nextInt();
            
            if(input <= 0){
                count++;
            }
            
        }while (input != 0);
        
        System.out.println("Number of negative numbers: " + (count-1));
 
    }

 
    
}
