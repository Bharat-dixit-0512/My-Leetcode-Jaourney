class Solution {
    public int maxProfit(int[] prices){
        int max=0;
        int sell=Integer.MIN_VALUE;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            sell=prices[i];
            max=Math.max(max,sell-buy);
        }
        return max;
    }
}