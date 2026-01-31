class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder stb = new StringBuilder();
        StringBuilder stb1 = new StringBuilder();

        for (String w : word1) {
            stb.append(w);
        }
        for (String w : word2) {
            stb1.append(w);
        }
        return stb.toString().equals(stb1.toString());
    }
}