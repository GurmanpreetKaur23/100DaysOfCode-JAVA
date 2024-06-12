// https://www.naukri.com/code360/problems/first-and-last-position-of-an-element-in-sorted-array_1082549


import java.util.ArrayList;
public class Solution {
    private static int firstOcc(ArrayList<Integer> arr , int k , int start , int end) {
        start = 0 ;
        end = arr.size()-1 ;
        int pos = -1 ;
        while(start<=end) {
            int mid = (start+end)/2 ;
            if(arr.get(mid)==k) {
                pos = mid ;
                end = mid - 1 ;
            }
            else if(arr.get(mid)>k) {
                end = mid - 1;
            }
            else if(arr.get(mid)<k) {
                start = mid + 1 ;
            }
        }
        return pos ;
    }

    private static int LastOcc(ArrayList<Integer> arr , int k , int start , int end) {
        start = 0 ;
        end = arr.size()-1 ;
        int pos = -1 ;
        while(start<=end) {
            int mid = (start+end)/2 ;
            if(arr.get(mid)==k) {
                pos = mid ;
                start = mid + 1 ;
            }
            else if(arr.get(mid)>k) {
                end = mid - 1;
            }
            else if(arr.get(mid)<k) {
                start = mid + 1 ;
            }
        }
        return pos ;
    }
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int res[] = {-1 , -1} ;
        int first = firstOcc(arr , k,0,arr.size()-1) ;
        int last = LastOcc(arr , k , 0 , arr.size()-1) ;

        res[0] = first ; 
        res[1] = last ;
        return res ;
    }

};
