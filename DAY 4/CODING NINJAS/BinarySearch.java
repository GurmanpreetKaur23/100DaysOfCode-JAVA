// https://www.naukri.com/code360/problems/binary-search_972

public class Solution {
    public static int search(int []nums, int target) {
        // Write your code here.
        int start = 0 , end = nums.length-1 ;
        while(start<=end) {
            int mid = (start+end)/2 ;
            if(nums[mid]==target) {
                return mid ;
            }
            else if(nums[mid]>target) {
                end = mid - 1 ;
            }
            else if(nums[mid]<target) {
                start = mid + 1;
            }
        }
        return -1 ;
        
    }
}
