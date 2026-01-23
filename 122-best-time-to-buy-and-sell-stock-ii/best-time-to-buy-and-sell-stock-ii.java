class Solution {
    public int maxProfit(int[] prices) {
      int second = 0, ans = 0;
      for(int i = 0; i<prices.length;i++){
            if(prices[i]>prices[second]) ans += prices[i]-prices[second];
            second = i;
      }  
      return ans;
    }
}