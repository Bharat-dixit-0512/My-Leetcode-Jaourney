class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int res[]=new int[spells.length];
        Arrays.sort(potions);

        for(int i=0;i<spells.length;i++){
            long minPotion = (success + spells[i] - 1) / spells[i];
            int index = binarySearch(potions, minPotion);
            res[i] = potions.length - index;
        }
        return res;
    }
    public int binarySearch(int[] arr,long target){
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;

            }
        }
        return left;
    }
}