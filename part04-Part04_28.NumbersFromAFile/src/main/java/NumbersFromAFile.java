
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {
    private static ArrayList<String> list = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int lowerBound, upperBound;
    private static int counter;

    public static void main(String[] args) {

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        upperBound = Integer.valueOf(scanner.nextLine());

        checkForNumberInFile(readFile(file));
        System.out.println("Numbers: " + counter);
    }

    private static ArrayList<String> readFile(String file) {
        try ( Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                list.add(fileScan.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }

    private static void checkForNumberInFile(ArrayList<String> list) {
        for (String item : list) {
            int number = Integer.valueOf(item);
            if(number >= lowerBound && number <= upperBound){
                counter++;
            } else {
                continue;
            }
        }
    }
}
