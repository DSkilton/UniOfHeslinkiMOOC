
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String identifier, name;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }
            
            Item item = new Item(identifier, name);
            
            if(items.contains(item)){
                continue;
            } else {
                items.add(item);
            }
            
        }// end of loop
        
        System.out.println("==Items==");
        
        for(Item item : items){
            System.out.println(item);
        }
    }

}
