package DSASHEET.ARRAYS;
import java.util.* ;

public class subarraySum {
    public static void subarraySum(int arr[] , int n) {
        
        for(int i=0 ; i<n ; i++) {
            int sum = 0;
            for(int j=i ; j<n ; j++) {
                sum += arr[j] ;
                System.out.println("Sum of subarray [" + i + " " + j + "] is " + sum);
            }
        }
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;

        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt() ;
        }

        subarraySum(arr, n);
    }
}
