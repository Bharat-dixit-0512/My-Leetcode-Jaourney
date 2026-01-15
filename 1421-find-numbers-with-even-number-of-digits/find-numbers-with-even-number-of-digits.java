class Solution {
    public int findNumbers(int[] nums) {
        int count=0; 
        for(int i:nums){
            int currCount=0;
            while(i>0){
                int rem=i%10;
                currCount++;
                i/=10;
            }
            if(currCount%2==0){
                count++;
            }
        }
        return count;
    }
}