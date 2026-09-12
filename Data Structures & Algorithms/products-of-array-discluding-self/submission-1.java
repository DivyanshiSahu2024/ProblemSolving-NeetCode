class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int output[] = new int[n];
        int product = 1;
        int countZeros = 0;

        // count Zeros
        for (int num : nums) {
            if (num == 0)
                countZeros++;
        }

        // Case 1: No Zeros
        if (countZeros == 0) {
            for (int num : nums) {
                product *= num;
            }
            for (int i = 0; i < n; i++) {
                output[i] = product / nums[i];
            }
        }

        //case 2 : More than one zeros
        else if (countZeros > 1) {
            for (int i = 0; i < n; i++) {
                output[i] = 0;
            }
        }

        //case 3: Exactly one zero
        else {
            int prod = 1;
            int zeroIndex = -1;
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    zeroIndex = i;
                } else {
                    prod *= nums[i];
                }
            }
            output[zeroIndex] = prod;
        }
        return output;
    }
}
