package Patterns;
import java.util.* ;

//     1
//    1 1 
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1


public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;

        int[][] pascal= new int[n][n] ;

        for(int i=0 ; i<n ; i++) {
            pascal[i][0] = 1 ;
            pascal[i][i] = 1 ;
        }

        for(int i=2 ; i<n ; i++) {
            for(int j=1 ; j<i ; j++) {
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j] ;
            }
        }

        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n-i-1 ; j++) {
                System.out.print(" ");
            }

            for(int j=0 ; j<=i ; j++) {
                System.out.print(pascal[i][j]+" ");
            }
            System.out.println();
        }
    }
}
