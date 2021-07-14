
import java.util.ArrayList;
import java.util.Scanner;





public class AdvancedAstrology {

    public static void printStars(int number) {
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for(int i = 1; i <= size; i++){
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for(int i = 1; i <= height; i++){
            printSpaces(height - i);
            printStars(2 * i - 1);
        }
        
        for(int i = 1; i < 3; i++){
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> ArrayListName = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        ArrayListName.add("Duncan"); //[0]
        ArrayListName.add("Codes");  //[1]
        ArrayListName.add("Java");   //[2]
        ArrayListName.add("Tutorial");
        ArrayListName.add("MOOC");
        
        System.out.println(ArrayListName.get(0));
        System.out.println(ArrayListName.get(2));
        System.out.println(ArrayListName.get(4));
        
        
        
    }
}
