public class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // calculate total sum of array
        for (int num : nums) {
            totalSum += num;
        }

        // iterate through array to find pivot index
        for (int i = 0; i < nums.length; i++) {
            // check if left sum equals the right sum
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // pivot index found
            }
            leftSum += nums[i];
        }
        // return -1 if no pivot index found
        return -1;

    }
    
}
