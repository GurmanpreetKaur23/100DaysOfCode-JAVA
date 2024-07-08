package DSASHEET.ARRAYS;
import java.util.* ;

public class maximumMinimum {
    public static void maxMin(int arr[] , int n ) {
        int max = arr[0] ;
        int min = arr[0] ;

        for(int i=0 ; i<n ; i++) {
            if(arr[i]>max) {max = arr[i] ;}
            if(arr[i]<min) {min = arr[i] ;} 
        }

        System.out.println("Maximum Element : "+max); 
        System.out.println("Minimum Element : "+min); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt() ;
        int arr[] = new int[n] ;

        for(int i=0 ; i<n ;i++) {
            arr[i] = sc.nextInt() ;
        }

        maxMin(arr, n);
    }
}
