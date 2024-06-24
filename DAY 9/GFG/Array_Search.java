// https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1?page=1&category=Arrays&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=difficulty

class Solution {

    static int search(int arr[], int n, int x) {

        // Your code here
        for(int i=0 ; i<n ; i++) {
            if(arr[i]==x) {
                return i;
            }
        }
        return -1;
    
    }
}
