
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int input = scan.nextByte();
        
        if(input > 17){
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}
