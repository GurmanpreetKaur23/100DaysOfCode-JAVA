// https://leetcode.com/problems/reverse-string/
class Solution {
    public void reverseString(char[] s) {
        int n = s.length ;
        char[] rev = new char[n] ;

        for(int i=n-1 ; i>=0 ; i--) {
            rev[i] = s[n - 1 - i];
        }
    
        for (int i = 0; i < n; i++) {
            s[i] = rev[i];
        }
    }
}
