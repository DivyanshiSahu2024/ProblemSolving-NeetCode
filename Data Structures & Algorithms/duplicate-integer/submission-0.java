class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(Integer key:freq.keySet()){
            if(freq.get(key)>1){
                return true;
            }
        }
        return false;
    }
}