package DSASHEET.ARRAYS;
import java.util.* ;

public class minimumJumps {
    public static int jumps(int arr[] , int n) {
        if(n<2) return 0 ;

        int jumps = 0 ;
        int farthest = 0 ;
        int currentEnd = 0 ;

        for(int i=0 ; i<n-1 ; i++) {
            farthest = Math.max(farthest , i + arr[i]) ;

            if(i==currentEnd) {
                jumps++ ;
                currentEnd = farthest ; 
            }
        }

        if(currentEnd>=n-1) return jumps ;
        else return 0 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;

        for(int i=0 ;i<n ;i++) {
            arr[i] = sc.nextInt() ;
        }

        int ans = jumps(arr, n) ;
        System.out.println(ans);
    }
}
