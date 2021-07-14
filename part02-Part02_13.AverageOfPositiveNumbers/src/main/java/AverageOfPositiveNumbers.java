
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, sum = 0, count = 0;
        
        while(true){
            input = scanner.nextInt();
        
            if(input == 0){
                break;
            }
            
            if(input > 0){
                count++;
                sum += input;
            }
        }// end of while loop
        
        if (count == 0){
            System.out.println("Cannot calculate the average");
        }
        
        System.out.println(1.0 * sum / count);
    }// end of main method
}
