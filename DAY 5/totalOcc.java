import java.util.Scanner;

public class totalOcc {
    public static int firstOcc(int arr[] , int n , int k , int start , int end) {
        start = 0 ; end = n-1 ;
        int pos = -1 ;
        while(start<=end) {
            int mid = (start+end)/2 ;
            if(arr[mid]==k) {
                pos = mid ;
                end = mid - 1;
            }
            else if(arr[mid]>k) {
                end = mid - 1;
            }
            else if(arr[mid]<k) {
                start = mid + 1 ;
            }
        }
        return pos ;
    }

    public static int lastOcc(int arr[] , int n , int k , int start , int end) {
        start = 0 ; end = n-1 ;
        int pos = -1 ;
        while(start<=end) {
            int mid = (start+end)/2 ;
            if(arr[mid]==k) {
                pos = mid ;
                start = mid + 1;
            }
            else if(arr[mid]>k) {
                end = mid - 1;
            }
            else if(arr[mid]<k) {
                start = mid + 1 ;
            }
        }
        return pos ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        System.out.println("Enter array elements : ");
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Enter target element : ");
        int k = sc.nextInt() ;
        int first = firstOcc(arr, n, k, 0, n-1) ;
        int last = lastOcc(arr, n, k, 0, n-1) ;
        int count ;
        if(first!=-1) {
            count = last - first + 1 ;
            System.out.print("Total number of occurences of "+k+" = "+ count);
        }
        else {
            System.out.println(k+ " not present");
        }
    }
    
}
