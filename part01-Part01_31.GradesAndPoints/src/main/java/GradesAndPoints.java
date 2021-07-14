
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int in1 = scan.nextInt();
        
        if(in1 < 0){
            System.out.println("Grade: impossible!");
        } else if (in1 <= 49){
            System.out.println("Grade: failed");
        } else if (in1 <= 59){
            System.out.println("Grade: 1");
        } else if (in1 <= 69){
            System.out.println("Grade: 2");
        } else if (in1 <= 79){
            System.out.println("Grade: 3");
        } else if (in1 <= 89){
            System.out.println("Grade: 4");
        } else if (in1 <= 100){
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible");
        }
            
    }
}
