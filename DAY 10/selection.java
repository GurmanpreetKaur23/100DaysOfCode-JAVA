import java.util.* ;
public class SelectionSort {
    public static void selection(int[] arr , int n) {
        for(int i=0 ; i<n-1 ; i++ ) {
            int smallest = i ;
            for(int j=i+1 ; j<n ; j++){
                if(arr[smallest]>arr[j]) {
                    smallest = j ;
                }
            }
            int temp = arr[smallest] ;
            arr[smallest] = arr[i] ;
            arr[i] = temp ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        
        int[] arr = new int[n] ;
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt() ;
        }

        System.out.println("ORIGINAL ARRAY : ");
        for(int i=0 ; i<n ; i++) {
            System.out.print(arr[i] +" ");
        }

        System.out.println();
        System.out.println("SORTED ARRAY : ");
        selection(arr, n);
        for(int i=0 ; i<n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
