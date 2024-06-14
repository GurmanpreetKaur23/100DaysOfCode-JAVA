// https://www.naukri.com/code360/problems/remove-duplicates-from-sorted-array_1102307?

public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int count = 1 ;

        if(n==0) {return 0 ;}
        for(int i=1 ; i<n ; i++) {
            if(arr[i] != arr[i-1]) {
                arr[count] = arr[i] ;
                count++ ;
            }
        }
        return count ;
    }
}
