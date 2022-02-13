
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int counter = 0;
        
        while(true){
            
            if(input.equals("end")){
                break;
            }
            
            input = scanner.nextLine();
            counter++;
        }
        
        System.out.println(--counter);

    }
}
