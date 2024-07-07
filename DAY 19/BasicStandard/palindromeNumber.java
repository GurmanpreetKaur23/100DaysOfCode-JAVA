package BasicStandard;
import java.util.* ;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;

        int og = n ;
        int rev = 0 ;
        while(n!=0) {
            int rem = n%10 ;
            rev = rev*10 + rem ;
            n = n/10 ;
        }

        if(og==rev) {
            System.out.println("PALINDROME NUMBER");
        }
        else {
            System.out.println("NOT A PALINDROME NUMBER");
        }
    }
}
