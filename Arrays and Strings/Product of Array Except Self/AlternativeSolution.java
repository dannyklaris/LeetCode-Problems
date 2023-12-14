public class AlternativeSolution {
    public int[] productExceptSelf(int[] nums) {
        // take the given array length
        int length = nums.length;

        // create a left and right array
        int[] leftProducts = new int[length];
        int[] rightProducts = new int[length];

        // aanswer array
        int[] answer = new int[length];

        // fill in the left products with all the products on the left of num[i]
        leftProducts[0] = 1;
        for (int i = 1; i < length; i++) {
            leftProducts[i] = nums[i-1] * leftProducts[i-1];
        }

        // fill in the right products with all the products on the right of num[i]
        rightProducts[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            rightProducts[i] = nums[i+1] * rightProducts[i+1];
        }

        // constructing answer
        for (int i = 0; i < length; i++) {
            answer[i] = leftProducts[i] * rightProducts[i];
        }
        return answer;
    }
}
