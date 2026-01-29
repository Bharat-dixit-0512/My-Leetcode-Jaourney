class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length())return false;
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(char ch:s.toCharArray()){
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            hm1.put(ch,hm1.getOrDefault(ch,0)-1);

        }
        for(int c:hm1.values()){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}