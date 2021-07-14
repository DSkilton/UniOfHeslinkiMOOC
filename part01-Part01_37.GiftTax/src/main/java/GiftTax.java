
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the Gift?");
        double input = Double.valueOf(scan.nextLine());
        
        double band1 = (100 + (input - 5000) * 0.08);
        double band2 = (1700 + (input - 25000) * 0.10);
        double band3 = (4700 + (input - 55000) * 0.12);
        double band4 = (22100 + (input - 200000) * 0.15);
        double band5 = (142100 + (input - 1000000) * 0.17);
        
        if (input < 5000) {
            System.out.println("No band!");
        } else if (input >= 5000 && input < 25000){
            System.out.println("Tax:" + band1);
        } else if (input >= 25000 && input < 55000){
            System.out.println("Tax:" + band2);
        } else if (input >= 55000 && input < 200000){
            System.out.println("Tax:" + band3);
        } else if (input >= 200000 && input < 1000000){
            System.out.println("Tax:" + band4);
        } else if (input >= 1000000){
            System.out.println("Tax:" + band5);
        }
        
    }
}
