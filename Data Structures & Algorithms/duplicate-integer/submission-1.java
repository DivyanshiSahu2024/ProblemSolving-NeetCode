class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate=false;
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(HashMap.Entry<Integer, Integer> entry: hm.entrySet()){
            if(entry.getValue()>1){
                duplicate=true;
            }
        }
        return duplicate;

    }
}