class Solution {
    public boolean isPalindrome(String s) {
        String cleaned =s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        int start=0;
        int end=cleaned.length()-1;
        while(start<=end){
            char ch=cleaned.charAt(start);
            char ch2=cleaned.charAt(end);
            if(ch!=ch2){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
