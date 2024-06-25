import java.util.* ;
public class InsertionSort {
    public static void insertion(int arr[] , int n) {
        for(int i=0 ; i<n ;i++) {
            int current = arr[i] ;
            int j = i-1 ; // count of unsorted part
            while(j>=0 && current<arr[j]) {
                arr[j+1] = arr[j] ;
                j-- ; // space bni jayegi pichli element vste
            }

            arr[j+1] = current ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt() ;
        }

        System.out.println("ORIGINAL ARRAY : ");
        for(int i=0 ; i<n ; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("SORTED ARRAY : ");
        insertion(arr, n);

        for(int i=0 ; i<n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
