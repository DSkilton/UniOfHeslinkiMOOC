
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintingAFile {

    public static void main(String[] args) {
        printFile();

    }
    
    public static void printFile(){
        try (Scanner SC = new Scanner(Paths.get("data.txt"))){
            while(SC.hasNextLine()){
                String row = SC.nextLine();
                System.out.println(row);
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    
    }
    
}
