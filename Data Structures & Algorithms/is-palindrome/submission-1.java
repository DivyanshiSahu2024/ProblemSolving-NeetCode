class Solution {
    public boolean isPalindrome(String s) {
       
        String normal=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int l=0;
        int r=normal.length()-1;
        while(l<r){
            char ptr1=normal.charAt(l);
            char ptr2=normal.charAt(r);
            if(ptr1!=ptr2){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
