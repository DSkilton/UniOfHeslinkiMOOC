
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money plus) {
        int totalCents = this.cents + plus.cents;
        int totalEuros = this.euros + plus.euros;
        Money newMoneyObj = new Money(totalEuros, totalCents);
//      class   object       constructor 

        return newMoneyObj;
    }

    public boolean lessThan(Money compared) {
        if (euros < compared.euros) {
            return true;
        }

        if (euros == compared.euros) {
            if (cents < compared.cents) {
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decreaser){
        int totalEuros = this.euros - decreaser.euros; 
        int totalCents = this.cents - decreaser.cents; 
        System.out.println(totalEuros);
        if(totalEuros >= 0){
            if (totalCents < 0){
                totalEuros = totalEuros - 1;
                totalCents = totalCents + 100;
            }
        }  else {
            totalEuros = 0;
            totalCents = 0;
        }
        
        Money newMoneyObj = new Money(totalEuros , totalCents);
        return newMoneyObj;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
