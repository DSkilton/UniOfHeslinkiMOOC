import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Title: ");
            String title = sc.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(sc.nextLine());
            
            System.out.println("Publication year ");
            int year = Integer.valueOf(sc.nextLine());
            
            books.add(new Book(title, pages, year));
            
        }//end of while
        
        System.out.println("What information will be printed? ");
        String printOut = sc.nextLine();
        
        for(Book book : books){
            if(printOut.equals("everything")){
                System.out.println(book.getEverything());
            } else if (printOut.equals("name")){
                System.out.println(book.getInstanceTitle());
            }
        }
    }
}
