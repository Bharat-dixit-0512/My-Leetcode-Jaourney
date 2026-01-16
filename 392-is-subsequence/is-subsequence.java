class Solution {
    public boolean isSubsequence(String s, String t) {
        int checkIncrement = -1;
        int prev = -1;
        char[] ch = s.toCharArray();
        for (char chh : ch) {
            checkIncrement = t.indexOf(chh, prev + 1);
            if (checkIncrement != -1 && prev < checkIncrement) {
                prev = checkIncrement;
            } else {
                return false;
            }
        }
        return true;
    }
}