package DSASHEET.ARRAYS;
import java.util.* ;

public class trappingRainWater {
    public static int rainWater(int height[] , int n) {
        int[] rightMax = new int[n] ;
        int[] leftMax = new int[n] ;

        leftMax[0] = height[0] ;
        for(int i=1 ; i<n ; i++) {
            leftMax[i] = Math.max(height[i] , leftMax[i-1]) ;
        }

        rightMax[n-1] = height[n-1] ;
        for(int i=n-2 ; i>=0 ; i--) {
            rightMax[i] = Math.max(height[i] , rightMax[i+1]) ;
        }

        int trappedRainWater = 0 ;
        for(int i=0 ; i<n ; i++) {
            int waterLevel = Math.min(leftMax[i] , rightMax[i]) ;

            trappedRainWater += waterLevel - height[i] ;
        }
        return trappedRainWater ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] height = new int[n] ;
        for(int i=0 ; i<n ; i++) {
            height[i] = sc.nextInt() ;
        }

        int trapped = rainWater(height , n) ;
        System.out.println(trapped);
    }
}
