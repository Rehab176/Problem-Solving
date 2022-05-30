
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Jetly
 */
public class Sheet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long res = ( n * (n +1)/2);
        System.out.println(res);
    }
    
}