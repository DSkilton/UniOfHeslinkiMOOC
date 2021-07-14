
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int in1 = scanner.nextInt();
        int in2 = scanner.nextInt();
        
        double sqr = Math.sqrt(in1 + in2);
                
        System.out.println(sqr);
    }
}
