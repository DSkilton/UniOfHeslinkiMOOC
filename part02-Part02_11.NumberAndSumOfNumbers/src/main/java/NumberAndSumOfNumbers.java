
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        greet();
        secondMethod();
    }// end of main method
    
    public static void greet(){
        System.out.println("Hello user");
    }//end of greet method
    
    public static void secondMethod(){
        System.out.println("start of method");
        greet();
        System.out.println("end of method");
    }
}//end of the class
