package DSASHEET.ARRAYS;
import java.util.* ;

public class pairsInArray {
    public static void pairs(int arr[] , int n) {
        for(int i=0 ; i<n ; i++) {
            int curr = arr[i] ;

            for(int j=i+1 ; j<n ; j++) {
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;

        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt() ;
        }

        pairs(arr, n);
    }
}
