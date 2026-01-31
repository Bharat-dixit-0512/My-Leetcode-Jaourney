class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int total=sum(nums);
        int left=0;
        for(int i=0;i<n;i++){
            int right=total-left-nums[i];
            if(left==right){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
    public int sum(int nums[]){
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        return sum;
    } 
}