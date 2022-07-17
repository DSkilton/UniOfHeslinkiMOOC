
import static java.lang.Math.abs;


public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        return (this.squares * this.pricePerSquare > compared.squares * compared.pricePerSquare) ? false : true;
    }
    
    public int priceDifference(Apartment compared){
        int price, comparedPrice;
        
        price = this.pricePerSquare * this.squares;
        comparedPrice = compared.pricePerSquare * compared.squares;
        
        return abs(price - comparedPrice); 
    }
    
    public boolean largerThan(Apartment compared){
        return (this.squares < compared.squares) ? false : true;
    }
}
