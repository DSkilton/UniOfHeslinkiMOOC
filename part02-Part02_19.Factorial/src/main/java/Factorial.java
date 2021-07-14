
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 1;
        
        System.out.print("Give a number:");
        int num = scanner.nextInt();
        
        for(int i = 1; i <= num; i++){

            sum *= i;
            System.out.println(sum);
        }
        
        System.out.print("Factorial: " + sum);
//        Give a number: 3
//      Factorial: 6
    }
}
