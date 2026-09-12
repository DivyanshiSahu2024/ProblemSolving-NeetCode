class Solution {
    public boolean isAnagram(String s, String t) {
        int countChar[]=new int[26];
        if(s.length()>t.length()){
            for(char ch:s.toCharArray()){
            int num=(int)ch-97;
            countChar[num]++;
          } 
          for(char ch:t.toCharArray()){
            int num=(int)ch-97;
            countChar[num]--;
          }
        }
        else{
            for(char ch:t.toCharArray()){
            int num=(int)ch-97;
            countChar[num]++;
          } 
           for(char ch:s.toCharArray()){
            int num=(int)ch-97;
            countChar[num]--;
          }
        }
       
       
        for(int i=0;i<26;i++){
            if(countChar[i]>0) return false;
        }
        return true;
    }
}
