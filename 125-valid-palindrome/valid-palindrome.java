class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder ns=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                ns.append(ch);
            }
        }
        int start=0;
        int end=ns.length()-1;
        while(start<end){
            if(ns.charAt(start) != ns.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}