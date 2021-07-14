
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String name;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        System.out.print("Search for? " + scanner);
        name = scanner.nextLine();
        
//        boolean found = list.contains(name);
//        if(found){
//            System.out.println(name + " was found!");
//        } else {
//            System.out.println("Not found");
//        }
        
        if(list.contains(name)){
            System.out.println(name + " was found!");
        } else {
            System.out.println(name + " was not found!");
        }
    }
}
