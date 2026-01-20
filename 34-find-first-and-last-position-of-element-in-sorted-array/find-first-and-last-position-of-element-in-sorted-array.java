public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[]=new int[2];
        result[0]=first(nums,target);
        result[1]=last(nums,target);
        return result;
    }
    public int first(int[] nums,int target){
        int left=0,right=nums.length-1,idx=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                right=mid-1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
            if(nums[mid]==target) idx=mid;
        }
        return idx;
    }
    public int last(int[] nums,int target){
        int left=0,right=nums.length-1,idx=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
            if(nums[mid]==target) idx=mid;
        }
        return idx;
    }
}