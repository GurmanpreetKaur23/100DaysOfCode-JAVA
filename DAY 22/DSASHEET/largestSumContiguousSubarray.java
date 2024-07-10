package DSASHEET.ARRAYS;
import java.util.* ;

public class largestSumContiguousSubarray {
    public static int soln(int arr[],int n) {
        int maxi = arr[0] ;
        int sum = 0;

        for(int i=0 ; i<n ; i++) {
            sum += arr[i] ;
            maxi = Math.max(maxi , sum) ;
            if(sum<0) sum=0 ; 
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

        int ans = soln(arr, n) ;
        System.out.println(ans);
    }
}
