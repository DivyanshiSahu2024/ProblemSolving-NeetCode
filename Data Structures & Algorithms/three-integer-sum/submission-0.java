class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        // List<Integer> subset=new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the fixed element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int lo = i + 1;
            int hi = nums.length - 1;

            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));

                    // Skip duplicate values for lo and hi
                    while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                    while (lo < hi && nums[hi] == nums[hi - 1]) hi--;

                    lo++;
                    hi--;
                } else if (sum < 0) {
                    lo++; // Need a larger sum
                } else {
                    hi--; // Need a smaller sum
                }
            }
        }
        return result;
    }
}
