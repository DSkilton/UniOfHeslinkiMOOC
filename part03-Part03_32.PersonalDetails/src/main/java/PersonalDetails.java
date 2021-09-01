
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int sum = 0, count = 0, birthYear = 0, nameLength, temp = 0;

        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }//end of if
            
            String[] col = input.split(",");
            sum += Integer.valueOf(col[1]);
            count++;
            nameLength = col[0].length();
            
            if(temp < nameLength){
                temp = nameLength;
                name = col[0];
            }
        }//end of while
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * sum/count);
    }
}
