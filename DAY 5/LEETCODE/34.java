// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    private int firstOcc(int[] nums , int target , int start , int end) {
        start = 0 ;
        end = nums.length-1 ;
        int pos = -1 ;
        while(start<=end) {
            int mid = (start+end)/2 ;
            if(nums[mid]==target) {
                pos = mid ;
                end = mid - 1 ;
            }
            else if(nums[mid]>target) {
                end = mid - 1;
            }
            else if(nums[mid]<target) {
                start = mid + 1 ;
            }
        }
        return pos ;
    }

    private int LastOcc(int[] nums , int target , int start , int end) {
        start = 0 ;
        end = nums.length-1 ;
        int pos = -1 ;
        while(start<=end) {
            int mid = (start+end)/2 ;
            if(nums[mid]==target) {
                pos = mid ;
                start = mid + 1 ;
            }
            else if(nums[mid]>target) {
                end = mid - 1;
            }
            else if(nums[mid]<target) {
                start = mid + 1 ;
            }
        }
        return pos ;
    }
        public int[] searchRange(int[] nums, int target) {
        int res[] = {-1 , -1} ;
        int first = firstOcc(nums , target,0,nums.length-1) ;
        int last = LastOcc(nums , target , 0 , nums.length-1) ;

        res[0] = first ; 
        res[1] = last ;
        return res ;
    }
    
}
