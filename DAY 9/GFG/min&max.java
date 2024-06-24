// https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1?page=1&category=Arrays&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=difficulty


class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min = a[0] ;
        long max = a[0] ;
        
        for(int i=0 ; i<n ; i++) {
            if(a[i]>max) {
                max = a[i];
            }
            
            if(a[i]<min) {
                min = a[i] ;
            }
        }
        return new Pair(min , max) ;
    }
}
