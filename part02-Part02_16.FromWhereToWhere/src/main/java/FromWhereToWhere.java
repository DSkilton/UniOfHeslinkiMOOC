
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int finish = scanner.nextInt();
        System.out.print("Where from?");
        int start = scanner.nextInt();
       
        for(int i = start; i <= finish; i++){
            if(finish >= start){
                System.out.println(i);
            } 

        }//end of for 

    }//end of main 
    
}//end of class 
