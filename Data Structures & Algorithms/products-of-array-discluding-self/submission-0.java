class Solution {
    public int[] productExceptSelf(int[] nums) {
        int output[]=new int[nums.length];
        int product=1;
        int countZeros=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) countZeros+=1;
        }

        for(int i=0;i<nums.length;i++){
            product*=nums[i];
        }
        if(countZeros==0){
            for(int i=0;i<nums.length;i++){
                 output[i]=product/nums[i];
               }
        }
       
        
        //---------------------
        if(countZeros>1){
            for(int i=0;i<nums.length;i++){
                output[i]=0;
            }
        }

        //---------------------
        if(countZeros==1){
            int prod=1;
            int index=-1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    index=i;
                }
                else{
                     prod*=nums[i];
                }                
            }
            output[index]=prod;
        }
        return output;
    }
}  
