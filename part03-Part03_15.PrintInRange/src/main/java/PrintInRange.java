
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> list, int lower, int higher){
        System.out.println("The numbers in the range [" + lower + ", " + higher + "]");
        
        for (int i : list){
            if((i > lower) && (i < higher)){
                System.out.println(i);
            }
        }
    }
    
}
