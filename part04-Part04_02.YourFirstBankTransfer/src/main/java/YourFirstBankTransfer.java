
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account a1 = new Account("Matthews account", 1000);
        Account a2 = new Account("My account", 0);
        
        a1.withdrawal(100);
        a2.deposit(100);
        
        System.out.println(a1);
        System.out.println(a2);
    }
}
