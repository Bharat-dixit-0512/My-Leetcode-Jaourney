class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int curr=0,wsize=Integer.MAX_VALUE;
        int start=0;
        int end=0;
        while(end<nums.length){
            curr+=nums[end];
            end++;
            while(curr>=target){
                wsize=Math.min(wsize,end-start);
                curr-=nums[start];
                start++;
            }
        }
        return wsize==Integer.MAX_VALUE?0:wsize;
    }
}