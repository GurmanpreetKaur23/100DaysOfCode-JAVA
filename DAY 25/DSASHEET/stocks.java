package DSASHEET.ARRAYS;
import java.util.* ;

public class stocks {
    public static int soln(int prices[] , int n) {
        int buyPrice = Integer.MAX_VALUE ;
        int maxProfit = 0;

        for(int i=0 ; i<n ; i++) {
            if(buyPrice<prices[i]) {
                int profit = prices[i] - buyPrice ;
                maxProfit = Math.max(profit , maxProfit) ;
            }
            else {
                buyPrice = prices[i] ;
            }
        }
        return maxProfit ;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] prices = new int[n] ;

        for(int i=0 ; i<n ; i++) {
            prices[i] = sc.nextInt() ;
        }

        System.out.println(soln(prices, n));
    }
}
