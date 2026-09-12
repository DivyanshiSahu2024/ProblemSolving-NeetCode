class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        for(int i=0;i<n-1;i++){
            if(nums[i+1]<nums[i]){
                min= nums[i+1];
                break;
            }
        }
        return min;
    }
}
