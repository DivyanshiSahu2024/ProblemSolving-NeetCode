class Solution{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(map.containsKey(target-num)){
                return new int[]{map.get(target-num),i};
            }
            map.put(num,i);
        }
        return new int[]{};
    }
}


//BRUTEFORCE
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(i!=j && nums[i]+nums[j]==target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{0,0};
//     }
// }
