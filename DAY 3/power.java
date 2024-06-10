// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.

import java.util.* ;
public class power {
    public static int ans(int x , int n) {
        return(int) Math.pow(x,n) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int x = sc.nextInt();
        int n = sc.nextInt() ;

        int sol = ans(x, n);
        System.out.println(sol) ;
    }
}
