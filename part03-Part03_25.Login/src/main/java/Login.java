
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Login {
    static String password = "sunshine", input;
    private static byte[] hash;

    public static void main(String[] args) throws NoSuchAlgorithmException {
            
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.nextLine();

        System.out.println("Enter password: ");
        password = scanner.nextLine();
        String hash = byteToHex();
        
        
        if ((username.equals("alex")) && (hash.equals("a941a4c4fd0c01cddef61b8be963bf4c1e2b0811c037ce3f1835fddf6ef6c223"))) {
            System.out.println("You have successfully logged in!");
        } else if ((username.equals("emma")) && (password.equals("haskell"))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("username or password!");
        }
    }
    
    public static byte[] getHash() throws NoSuchAlgorithmException{
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        return hash = messageDigest.digest(password.getBytes(StandardCharsets.UTF_8));
    }
    
    public static String byteToHex() throws NoSuchAlgorithmException{
        return hash(getHash());
    }

    public static String hash(byte[] hash) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(255 & hash[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        System.out.println(hexString);
        return hexString.toString();
    }

}
