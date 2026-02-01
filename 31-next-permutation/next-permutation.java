class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1, n = nums.length;
        
        // Step 1: Find the first decreasing element from the right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        
        // If no such index, reverse the whole array (last permutation → first permutation)
        if (idx == -1) {
            rev(nums, 0, n - 1);
            return;
        }
        
        // Step 2: Find the element just larger than nums[idx] from the right
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums, i, idx);
                break;
            }
        }
        
        // Step 3: Reverse the suffix
        rev(nums, idx + 1, n - 1);
    }
    
    // Correct swap method: operates on the array
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    // Reverse subarray from idx to n
    public void rev(int[] nums, int idx, int n) {
        while (idx < n) {
            int temp = nums[idx];
            nums[idx] = nums[n];
            nums[n] = temp;
            idx++;
            n--;
        }
    }
}