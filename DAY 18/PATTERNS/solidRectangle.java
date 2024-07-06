package Patterns;
import java.util.* ;

// * * * *
// * * * * 
// * * * * 
// * * * * 

public class solidRectangle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    int n = sc.nextInt() ; // rows
    int m = sc.nextInt() ; // columns

    for(int i=0 ; i<n ; i++) {
        for(int j=0 ; j<m ; j++) {
            System.out.print(" * ");
        }
        System.out.println();
    }
    }
}
