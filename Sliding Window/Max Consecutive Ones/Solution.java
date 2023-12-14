public class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, maxOnesCount = 0, windowZeroCount = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                windowZeroCount++;
            }

            while (windowZeroCount > k) {
                if (nums[left] == 0) {
                    windowZeroCount--;
                }
                left++;
            }

            maxOnesCount = Math.max(maxOnesCount, right - left + 1);
        }
        
        return maxOnesCount;
    }
}
