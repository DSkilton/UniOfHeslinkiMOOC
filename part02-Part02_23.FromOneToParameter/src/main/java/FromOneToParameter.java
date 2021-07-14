

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }//end of main method
    
    public static void printUntilNumber(int input){
        int counter = 1;
        
        while(counter <= input){
            System.out.println(counter);
            counter++;
        }
        
    }//end of printUntilNumber method

}//end of class
