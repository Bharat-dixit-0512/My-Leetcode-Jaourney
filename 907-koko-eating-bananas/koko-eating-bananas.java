class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i:piles){
            if(max<i)max=i;
        }
        long start=1,end=max;
        long k=max;
        while(start<=end){
            long mid=start+(end-start)/2;
            long hrs=hours(piles,mid);
            if(hrs>h){
                start=mid+1;
            }
            else{
                k=mid;
                end=mid-1;
            }
        }
        return (int)k;
    }
    public long hours(int piles[],long k){
        long hrs=0;
        for(int i=0;i<piles.length;i++){
            hrs+=(long)Math.ceil((double)piles[i]/k);
        }
        return hrs;
    }
}