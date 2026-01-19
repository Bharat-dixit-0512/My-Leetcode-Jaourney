class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder stb=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            stb.append((char)((columnNumber%26)+'A'));
            columnNumber/=26;
        }
        stb.reverse();
        return stb.toString();
    }
}