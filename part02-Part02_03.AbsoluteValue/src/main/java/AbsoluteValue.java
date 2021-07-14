
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int in = scanner.nextInt();
     
        
        if(in < 0){
            System.out.println(in *= -1);
        } else {
            System.out.println(in);
        }

    }
}
