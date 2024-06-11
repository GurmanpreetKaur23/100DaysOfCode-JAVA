import java.util.* ;
public class linear_search {
    public static boolean linear(int arr[] , int n , int k) {
        for(int i=0 ; i<n ; i++) {
            if(arr[i]==k) {
                return true ;
            }
        }
        return false ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements : "); 
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        System.out.println("Enter array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter element to be searched : ");
        int k = sc.nextInt() ;
        if (linear(arr, n, k)) {
            System.out.println(k + " found in the array.");
        } else {
            System.out.println(k + " not present in the array.");
        }
        sc.close() ;
    }
}
