package DSASHEET.ARRAYS;
import java.util.* ;

public class kthMinMax {
    public static int kthMin(int arr[] , int n ,int k){
        Arrays.sort(arr) ;
        return arr[k-1] ;
    }

    public static int kthMax(int arr[] , int n , int k) {
        Arrays.sort(arr) ;
        return arr[n-k] ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int k = sc.nextInt() ;
        int arr[] = new int[n] ;

        for(int i=0 ; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = kthMin(arr , n , k) ;
        System.out.println(min);

        int max = kthMax(arr, n, k) ;
        System.out.println(max);
    }

}
