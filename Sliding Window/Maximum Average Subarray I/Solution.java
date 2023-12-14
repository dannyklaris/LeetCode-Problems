public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        // Calculate the sum of the first k elements (initial window)
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        // Slide the window from k to the end of the array
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i]; // Update the sum by removing the first element of the window and adding the next element
            maxSum = Math.max(maxSum, sum); // Update the maxSum if the new sum is greater
        }

        // Calculate the maximum average
        return maxSum / k;
    }
}
