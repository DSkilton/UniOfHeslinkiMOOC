
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();

        recordsFromFile(file);
    }

    public static void recordsFromFile(String fileName) {
        String row, name = "";
        String[] array;
        int age = 0;

        try ( Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()) {
                row = reader.nextLine();

                array = row.split(",");
                name = array[0];

                age = Integer.valueOf(array[1]);

                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

}
