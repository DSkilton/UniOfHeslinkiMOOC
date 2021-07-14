
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i]; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
