class Solution {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        productExceptSelf(nums);
    }
    public static int[] productExceptSelf(int[] nums) {
        // we take the array lengths to avoid redundancy
        int length = nums.length;

        // create 2 arrays to store for left and right calculations
        int[] leftProducts = new int[length];
        int[] rightProducts = new int[length];

        // create answer array to return
        int[] answer = new int[length];
        // forloop to calculate the leftproducts of num[i]
        leftProducts[0] = 1;
        for (int i = 1; i < length; i++) {
            leftProducts[i] = nums[i - 1] * leftProducts[i - 1];
        }
        // forloop to calculate the rightproducts of num[i] from backwards
        rightProducts[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            rightProducts[i] = nums[i + 1] * rightProducts[i + 1];
        }
        // for loop to calculate the result of the multiplication of both arrays
        for (int i = 0; i < length; i++) {
            answer[i] = leftProducts[i] * rightProducts[i];
        }
        // return the answer array
        return answer;
    }
}