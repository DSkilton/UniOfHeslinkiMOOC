
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, n = 0;
        String name = "";
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }//end of if
            
            String[] col = input.split(",");
            age = Integer.valueOf(col[1]);
            
            if(age > n){
                n = age;
                name = col[0];
            }
        }//end of while
        
        System.out.println("Name of the oldest: " + name);
    }
}
