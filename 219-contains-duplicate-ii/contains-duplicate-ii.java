class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> hs1 = new HashSet<>();
        int i = 0;
        int j = 0;
        while (j < n) {
            if (Math.abs(i - j) > k) {
                hs1.remove(nums[i]);
                i++;
            }
            if (hs1.contains(nums[j])) {
                return true;
            }
            hs1.add(nums[j]);
            j++;
        }
        return false;
    }
}