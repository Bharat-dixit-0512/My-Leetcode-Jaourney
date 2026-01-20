class Solution {
    public int findPeakElement(int[] nums) {
        int idx=0,max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                idx=i;
                max=nums[i];
            }
        }
        return idx;
    }
}