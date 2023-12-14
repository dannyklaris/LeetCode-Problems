public class CorrectedSolution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if (n < 3) return false; // the array needs to at least be 3

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] <= first) {
                // update smallest number find so far
                first = nums[i];
            }
            else if (nums[i] < second) {
                // update second smallest number
                second = nums[i];
            }
            else if (nums[i] > second) {
                // found number greater than both first and second
                return true;
            }
        }
        return false;
    }
}
