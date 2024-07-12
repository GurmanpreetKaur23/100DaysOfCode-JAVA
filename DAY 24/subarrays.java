package DSASHEET.ARRAYS;
import java.util.* ;

public class subarrays {
    public static void subarray(int arr[] , int n) {
        for(int i=0 ; i<n ; i++) {
            int start = i ;
            for(int j = i ; j<n ; j++) {
                int end = j ;
                for(int k=start ; k<=end ; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
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

        subarray(arr, n);
    }
}
