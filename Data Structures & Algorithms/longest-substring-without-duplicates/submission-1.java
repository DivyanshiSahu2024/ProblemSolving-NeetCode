class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            Set<Character> charSet = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (charSet.contains(c)) {
                    break;
                }
                charSet.add(c);
            }
            res = Math.max(res, charSet.size());
        }
        return res;
    }
}
