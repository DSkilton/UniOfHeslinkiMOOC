
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Give a number:");
            int in = scanner.nextInt();
            
            if(in == 4){
                break;
            }//end of if 
        }//end of while loop
    }//end of method
}
