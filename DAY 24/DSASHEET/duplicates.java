package DSASHEET.ARRAYS;
import java.util.* ;

public class duplicates {
    public static int findDuplicates(int arr[] , int n) {
        int ans = 0 ;
        Arrays.sort(arr) ;
        for(int i=0 ; i<n ; i++) {
            if(arr[i] == arr[i+1]) {
                ans = arr[i] ;
                break ;
            }
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
        System.out.println(findDuplicates(arr, n));
    }    
}
