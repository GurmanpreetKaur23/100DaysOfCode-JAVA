package DSASHEET.ARRAYS;
import java.util.* ;

public class MoveNegatives {
    public static void move(int arr[] , int n) {
        int ans[] = new int[n] ;
        int k = 0 ;

        // negatives 
        for(int i=0;i<n ;i++) {
            if(arr[i]<0) {
                ans[k] = arr[i] ; 
                k++ ;
            }
        }

        // positives and zero 
        for(int i=0 ; i<n ; i++) {
            if(arr[i]>=0){
                ans[k] = arr[i] ;
                k++ ;
            }
        } 

        // combining both
        for(int i=0 ;i<n ; i++) {
            arr[i] = ans[i] ;
        }
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;

        for(int i=0 ; i<n ; i++) {
            arr[i]= sc.nextInt() ;
        }

        move(arr, n);

        for(int i=0 ; i<n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
