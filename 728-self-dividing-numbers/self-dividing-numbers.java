class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        
        for (int num = left; num <= right; num++) {
            if (isSelfDividing(num)) {
                list.add(num);
            }
        }
        return list;
    }
    private boolean isSelfDividing(int num) {
        int x = num;
        while (x > 0) {
            int digit = x % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
}