
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        
        System.out.println("Last number?");
        int lN = scanner.nextInt();
        
        
//        for(int i = 0; i <= lN; i++){
//            sum += i;
//        }
//        
//        System.out.println("The sum is " + sum);
        
        while(lN >= count){
            sum += count;
            count++;
        }
        
        System.out.println("The sum is " + sum);
    }
}
