
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0, sum = 0, count = 0, even = 0, odd = 0;
        double avg = 0.0;
        
        System.out.println("Give numbers:");
        
        while(input != -1){
            input = scanner.nextInt();
            if(input >= 0){
                sum += input;
                count++;
                if(input % 2 == 0){
                    even++;
                } else {
                    odd++;
                }//end of nested if 
            }//end of greater than 0 if
        }//end of while 
        
        avg = 1.0 * sum / count;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        
    }
}
