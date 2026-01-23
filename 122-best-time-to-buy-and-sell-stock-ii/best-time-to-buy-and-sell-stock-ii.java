class Solution {
    public int maxProfit(int[] prices) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int idx = 0 ; idx < prices.length-1; idx++){
            if( prices[idx] < prices[idx+1] ){
                list.add( prices[idx+1]- prices[idx]);
            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum=sum+list.get(i);
        }
        return sum;    
    }
}