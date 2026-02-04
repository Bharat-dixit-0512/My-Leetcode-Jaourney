class Solution {
    public List<Integer> findAnagrams(String s2, String p) {
        List<Integer> list = new ArrayList<>();
        int k = p.length();
        for (int i = 0; i <= s2.length() - k; i++) {
            String sub = s2.substring(i, i + k);
            if (isAnagram(p, sub)) {
                list.add(i);
            }
        }
        return list;
    }

    public boolean isAnagram(String s, String t) {
        int[] f1 = new int[26];
        for (char ch : s.toCharArray()) {
            f1[ch - 'a']++;
        }
        int[] f2 = new int[26];
        for (char ch : t.toCharArray()) {
            f2[ch - 'a']++;
        }
        return Arrays.equals(f1, f2);
    }
}