

public class Agent {

    private String firstName;
    private String lastName;
    
    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }
    
    public void print() {
    System.out.println("My name is " + this.lastName + ", " + this.firstName + " " + this.lastName);
    }
    
}
