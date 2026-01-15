class Solution {
    public int findNumbers(int[] nums) {
        int count=0; 
        for(int i:nums){
            int currCount=0;
            while(i>0){
                i/=10;
                currCount++;
            }
            if(currCount%2==0){
                count++;
            }
        }
        return count;
    }
}