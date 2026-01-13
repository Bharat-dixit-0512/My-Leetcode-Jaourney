class Solution {
    public String reverseWords(String s) {
        String ch[]=s.split(" ");
        StringBuilder stb=new StringBuilder();

        for(int i=ch.length-1;i>=0;i--){
            if(ch[i].equals("")) continue;
            stb.append(ch[i]).append(" ");
        }
        return stb.toString().trim();
    }
}