
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0, count = 0;              
        
        while(true){
            System.out.println("Give a number:");
            input = scanner.nextInt();
            
            if(input != 0){
                count++;   // this add 1 to count
            // count += 1, different of adding 1 
            // count = count + 1
            }
            
            if(input == 0){
                break;
            }
            
        }// end of loop
        
        System.out.println("Number of numbers: " + count);
    }// end of main
}
