class Solution {
     public int jump(int[] nums) {
        return jump(nums, 0,0,0);
    }

    public int jump(int[] nums, int start, int end, int jump) {
        if(end >= nums.length -1)
        {
            return jump;
        }

        int far = 0;
        for (int i = start; i <= end; i++) {
            far = Math.max(far, i + nums[i]);
        }
        return jump( nums, end + 1, far, jump + 1);
    }
}