package DSASHEET.ARRAYS;
import java.util.* ;

public class MinimiseHeight {
    public static int maximise(int[] arr , int n , int k) {
        Arrays.sort(arr) ;
        int ans = arr[n-1] - arr[0] ;
        int lowest = arr[0] + k ;
        int largest = arr[n-1] - k ;

        for(int i=0 ; i<n-1 ; i++) {
            int mini = Math.min(lowest , arr[i+1]-k) ;
            int maxi = Math.max(largest , arr[i]+k) ;

            if(mini<0) continue ;
            ans = Math.min(ans , maxi-mini) ;
        }
        return ans ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt() ;
        }

        int k = sc.nextInt() ;
        int ans = maximise(arr, n, k) ;
        System.out.println(ans);
    }
}
