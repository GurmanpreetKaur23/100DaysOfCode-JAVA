package DSASHEET.ARRAYS;
import java.util.* ;

public class nextPermutation {
    public static void permutation(int nums[]) {
        int n = nums.length ;
        int k = n-2 ;

        if(n==0) return  ;
        while(k>=0 && nums[k]>nums[k+1]) {
            k-- ;
        }

        if(k==-1) {
            reverse(nums , 0 , n-1) ;
            return ;
        }

        
        for(int i=n-1 ; i>k ; i--) {
            if(nums[i]>nums[k]) {
                int temp = nums[k] ;
                nums[k] = nums[i] ;
                nums[i] = temp ;
                break ;
            }
        }
        reverse(nums , k+1 , n-1) ;
    }

    public static void reverse(int nums[] , int start , int end) {
        while(start<=end) {
            int temp = nums[start] ;
            nums[start] = nums[end] ;
            nums[end] = temp ;
            start++; 
            end-- ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int nums[] = new int[n] ;

        for(int i=0 ; i<n ; i++) {
            nums[i] = sc.nextInt() ;
        }

        permutation(nums);
        System.out.println(Arrays.toString(nums));
        
    }

}
