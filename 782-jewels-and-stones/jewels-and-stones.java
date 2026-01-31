class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char ch:jewels.toCharArray()){
            char jChar=ch;
            boolean flag=false;
            if(Character.isLowerCase(jChar))flag=true;
            for(char ch2:stones.toCharArray()){
                if(flag==true && Character.isLowerCase(ch2)){
                    if(ch==ch2){
                        count++;
                    }
                }
                if(flag==false && Character.isUpperCase(ch2)){
                    if(ch==ch2){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}