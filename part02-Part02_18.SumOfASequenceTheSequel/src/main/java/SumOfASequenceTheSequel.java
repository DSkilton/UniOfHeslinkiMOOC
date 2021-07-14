
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperNumber, sum = 0;
        
        System.out.println("First number?");
        int lowerNumber = scanner.nextInt();
        
        System.out.println("Last number?");
        upperNumber = scanner.nextByte();
        
//        for(int i = lowerNumber; lowerNumber <= upperNumber; lowerNumber++){
//            sum += lowerNumber;
//        }
        
        while(lowerNumber <= upperNumber){
            sum += lowerNumber;
            lowerNumber++;
        }

        System.out.println("The sum is " + sum);


    }
}
