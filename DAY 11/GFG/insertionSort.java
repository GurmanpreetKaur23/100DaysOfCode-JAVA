// https://www.geeksforgeeks.org/problems/insertion-sort/1

class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        
        // boolean res=false;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
               sum=sum+arr[j];
               if(sum==0)
               {
                   return true;
               
               }
               
            }
        }
        return false;
    }
}
