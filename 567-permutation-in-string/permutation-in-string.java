class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int f1[]=new int[26];
        for(char ch:s1.toCharArray()){
            f1[ch-'a']++;
        }
        int k=s1.length();
        int f2[]=new int[26];
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            f2[ch-'a']++;
            if(i<k-1)continue;
            if(Arrays.equals(f1,f2))return true;
            int sidx=i-(k-1);
            char r=s2.charAt(sidx);
            f2[r-'a']--;
        }
        return false;
    }
}