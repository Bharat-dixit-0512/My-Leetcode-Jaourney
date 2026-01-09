class Solution {
    public int thirdMax(int[] nums) {
       long fmax=Long.MIN_VALUE;
       long smax=Long.MIN_VALUE;
       long tmax=Long.MIN_VALUE;
       for(int num:nums){
        if(num>fmax){
            tmax=smax;
            smax=fmax;
            fmax=num;

        }else if(num>smax && num!=fmax){
            tmax=smax;
            smax=num;
            
        }
        else if(num>tmax && num!=smax && num!=fmax){
            tmax=num;
        }
        
       }
       return tmax!=Long.MIN_VALUE ? (int)tmax:(int)fmax;
    }
}