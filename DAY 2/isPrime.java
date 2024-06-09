// Make a function to check if a number is prime or not.

import java.util.* ;
public class isPrime {
    public static boolean IsPrime(int n) {
        if(n==1) {
            return true ;
        }
        else if(n==3) {
            return true ;
        }
        else if(n%2==0 || n%3==0) {
            return false ;
        }
        return false ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;

        if(IsPrime(a)) {
            System.out.println("prime number");
        }
        else {
            System.out.println("not a prime number");
        }
    }
}
