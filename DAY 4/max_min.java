// Find the maximum & minimum number in an array of integers. 

import java.util.* ;
public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt() ;

        int arr[]= new int[n] ;
        for(int i=0 ; i<n ; i++) {
            arr[i] =sc.nextInt() ;
        }
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;

        for(int i=0 ; i<n ; i++) {
            if(arr[i]<min) {
                min = arr[i] ;
            }
            if(arr[i]>max) {
                max = arr[i] ;
            }
        }
        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);
    }
}
