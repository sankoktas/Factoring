/**This program factors
 * @author (Fikri San Koktas)
 * @version (25 February 2021) **/
import java.util.Scanner;
public class KFS_Factoring_Main
{
    public static void primeFactors(int n) 
    { 
        while (n % 2 == 0) 
        { 
            System.out.print(2 + " "); 
            n /= 2; // While n is divided by 2, print 2 and divide the number by 2 
        }   
        for (int i = 3; i <= Math.sqrt(n); i += 2) 
        { 
            while (n % i == 0) 
            { 
                System.out.print(i + " "); 
                n /= i; // While i divides n, print i and divide n
            } 
        } 
        if (n > 2) 
            System.out.print(n);
    } 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer to test this program:");
        int n;
        n = sc.nextInt();
        primeFactors(n); 
    } 
}
