package DSASHEET.ARRAYS;
import java.util.* ;

public class union {
    public static int soln(int arr1[] , int arr2[]) {
        int n = arr1.length ;
        int m = arr2.length ;

        // combine both arrays 
        int[] combined = new int[n+m] ;

        // copy array
        System.arraycopy(arr1 , 0 , combined , 0 , n) ;
        System.arraycopy(arr2 , 0 , combined , n , m) ;

        // remove duplicates 
        int[] temp = new int[combined.length] ;
        int size = 0;

        for(int i=0 ; i<combined.length ; i++) {
            boolean isDuplicate = false ;
            for(int j=0 ; j<size ; j++) {
                if(combined[i] == temp[j]) {
                    isDuplicate = true ;
                }
            }

            if(!isDuplicate) {
                temp[size++] = combined[i] ;
            }
        }
        return size ;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt() ;
        int[] arr1 = new int[n] ;

        int m = sc.nextInt() ;
        int[] arr2 = new int[m] ;

        for(int i=0 ; i<n ; i++) {
            arr1[i] = sc.nextInt() ;
        }

        for(int i=0 ; i<m ; i++) {
            arr2[i] = sc.nextInt() ;
        }

        int ans = soln(arr1, arr2) ;
        System.out.println(ans);
    }
}
