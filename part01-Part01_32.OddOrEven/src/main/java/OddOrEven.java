
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int in1 = scan.nextInt();
        
        if(in1 % 2 == 0){
            System.out.println("Number " + in1 + " is even");
        } else {
            System.out.println("Number " + in1 + " is odd");
        }
       

    }
}
