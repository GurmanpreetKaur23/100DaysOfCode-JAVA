package DSASHEET.ARRAYS;
import java.util.* ;

public class CyclicallyRotate {
    private static void reverseArray(int arr[] , int start , int end) {
        while(start<end) {
            int temp = arr[start] ;
            arr[start] = arr[end] ;
            arr[end] = temp ;
            start++ ;
            end-- ;
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;

        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt() ;
        }

        int k = sc.nextInt() ;
        k = k%n ;
        reverseArray(arr , 0 ,n-1) ;
        reverseArray(arr , 0 , k-1) ;
        reverseArray(arr , k , n-1) ;

        for(int i=0 ; i<n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
