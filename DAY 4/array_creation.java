import java.util.* ;

public class array_creation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt() ;

        // array creation 
        int[] arr = new int[n] ;
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt() ;
        }

        // printing array 
        System.out.println("Array elements : ");
        for(int i=0 ; i<n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
