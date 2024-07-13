class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length ;
        int Bp = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0 ; i<n ; i++) {
            if(Bp < prices[i]) {
                int profit = prices[i] - Bp ;
                maxProfit = Math.max(maxProfit , profit) ; 
            }

            else {
                Bp = prices[i] ;
            }
        }
        return maxProfit ;
    }
}
