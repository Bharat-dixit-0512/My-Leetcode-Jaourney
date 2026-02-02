class Solution {
    public String longestCommonPrefix(String[] arr) {
        if(arr.length==0 || arr==null){
            return "";
        }
        String prefix=arr[0];
        for(int i=0;i<arr.length;i++){
            while(arr[i].indexOf(prefix)!=0){
                prefix= prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}