package DSASHEET.ARRAYS;
import java.util.* ;

public class kadanes {
    public static int kadane(int arr[] , int n) {
        int maxi = arr[0] ;
        int sum = 0 ;
        for(int i=0 ; i<n ; i++) {
            sum += arr[i] ;
            maxi = Math.max(sum , maxi) ;

            if(sum<0) sum = 0; 
        }
        return maxi ;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;

        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt() ;
        } 
        
        System.out.println(kadane(arr, n));
    }
}
