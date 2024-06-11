import java.util.* ;
public class binary_search {
    public static int binary(int arr[] , int n , int k ,int start , int end) {
        start = 0 ;
        end = n-1 ;
        while(start<=end) {
            int mid = (start+end)/2 ;
            if(arr[mid]==k) {
                return mid ;
            }
            else if(arr[mid]>k) {
                end = mid - 1;
            }
            else if(arr[mid]<k) {
                start = mid + 1;
            }
        }
        return -1 ; // element not present
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the size of array : ");
        int n = sc.nextInt() ;

        int arr[] = new int[n] ;
        System.out.println("enter array elements : ");

        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Enter element to be searched : ");
        int k = sc.nextInt() ;

        int result = binary(arr, n, k, 0, n-1) ;

        if(result==-1) {
            System.out.println("element not present");
        }
        else {
            System.out.println(k+" found at index "+result);
        }
    }
}
