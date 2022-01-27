
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
   
            String firstName = scanner.nextLine();
            
            if(firstName.isEmpty()){
                break;
            }// end of if
            

            String lastName = scanner.nextLine();
            
  
            String idNumber = scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstName, lastName, idNumber));
        }
        
        for(PersonalInformation pi : infoCollection){
            System.out.println(pi.getFirstName() + " " + pi.getLastName());
        }
    }
}
