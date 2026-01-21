class Solution {
    public int vowelConsonantScore(String s) {
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            if("aeiou".indexOf(s.charAt(i)) != -1){
                a++;
            }else if(Character.isLetter(s.charAt(i))){
                b++;
            }
        }
        if(a==0 || b==0)return 0;
        return a/b;
    }
}