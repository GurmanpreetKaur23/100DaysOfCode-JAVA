package BasicStandard;
import java.util.* ;

// 0 1 1 2 3 5 8 13 21 ..... 

public class fibonacci {
    public static void fibo(int n) {
        int a = 0 , b = 1 ;

        for(int i=0 ; i<n ; i++) {
            System.out.print(a+" ");
            int c = a+ b ;
            a = b ;
            b = c;
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        fibo(n);
    }    
}
