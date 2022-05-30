
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
        long A=input.nextLong();
        long B=input.nextLong();
        long C=input.nextLong();
        long D=input.nextLong();
        long X=(A*B)-(C*D);
        
        
        System.out.println("Difference = "+ X);
    }
    
}
