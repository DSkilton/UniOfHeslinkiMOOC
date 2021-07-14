
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int in = scanner.nextInt();
            
            if (in == 9999){
                break;
            }
            
            list.add(in);
        }// end of while
        
        int small = list.get(0);
        int num = 0;
        
        for(int i = 0; i < list.size(); i++){
            num = list.get(i);
            if(small > num){
                small = num;
            }
        }
        
        System.out.println("Smallest number: " + small);
        
        for(int i = 0; i < list.size(); i++){
            if(small == list.get(i)){
                System.out.println("Found at index: " + i);
            }
        }

    }
}
