package DSASHEET.ARRAYS;
import java.util.* ;

// DUTCH NATIONAL FLAG ALGORITHM 

public class sort012 {
    public static void sort(int arr[] , int n) {
        int z = 0;
        int o = 0;
        int t = 0;

        for(int i=0 ; i<n ; i++) {
            if(arr[i]==0) z++ ;
            if(arr[i]==1) o++ ;
            if(arr[i]==2) t++ ;
        }

        int index = 0 ;
        
        for(int i=0 ; i<z ;i++) {
            arr[index++] = 0 ;
        }

        for(int i=0 ; i<o ; i++) {
            arr[index++] = 1; 
        }

        for(int i=0 ;i<t ;i++) {
            arr[index++] = 2 ;
        }
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;

        for(int i=0 ; i<n ;i++) {
            arr[i] = sc.nextInt() ;
        }

        sort(arr, n);
        for(int i=0 ; i<n ;i++) {
           System.out.print(arr[i]+" ");
        }
    }
}
