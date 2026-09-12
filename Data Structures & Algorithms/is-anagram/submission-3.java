class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length() != t.length()) return false;
      HashMap<Character, Integer> hm=new HashMap<>();
      for(char c:s.toCharArray()){
        hm.put(c,hm.getOrDefault(c,0)+1);
      }
      for(char ch:t.toCharArray()){
        if(!hm.containsKey(ch)) return false;
        hm.put(ch,hm.get(ch)-1);
        if(hm.get(ch)<0) return false;
      }
      return true;
    }
}
