
public class MainProgram {

    public static void main(String[] args) {
        Counter c = new Counter(900);
        c.decrease(7);
        System.out.println(c.value());
        System.out.println(c);
    }
}
