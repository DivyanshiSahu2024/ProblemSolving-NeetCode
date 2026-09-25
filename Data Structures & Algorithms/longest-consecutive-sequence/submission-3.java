class Solution {
    public int longestConsecutive(int[] nums) {
       
        if(nums.length==0) return 0;
        Arrays.sort(nums);

        int maxStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            // Skip duplicates
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            // Consecutive element found
            if (nums[i] == nums[i - 1] + 1) {
                currentStreak++;
            } else {
                // Sequence broken; reset streak counter
                maxStreak = Math.max(maxStreak, currentStreak);
                currentStreak = 1;
            }
        }

        return Math.max(maxStreak, currentStreak);
    }
}
