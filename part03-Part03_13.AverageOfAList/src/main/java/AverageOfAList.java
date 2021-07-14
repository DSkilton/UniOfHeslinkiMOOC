
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0, inputAmount = 0;
        
        while (true) {
            int input = scanner.nextInt();
        
            if (input == -1) {
                break;
            }

            list.add(input);
        }
                
        for(int i : list){
            sum += i;
            inputAmount++;
        }
        
        System.out.println("Average: " + 1.0 * sum/inputAmount);
    }
}
