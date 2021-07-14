
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greatest; 
        
        if(number1 > number2){
            greatest = number1;
        } else {
            greatest = number2;
        }
        
        if(number3 > greatest){
            greatest = number3;
        }

        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
