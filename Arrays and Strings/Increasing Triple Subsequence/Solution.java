class Solution {
    public static void main(String[] args) {
        int[] nums = {2,1,5,0,4,6};
        System.out.println(increasingTriplet(nums));
        
    }
    public static boolean increasingTriplet(int[] nums) {
        // Array length
        int n = nums.length;
        // an array placeholder
        int[] placeholder = new int[n];
        // array iteration, for loop is good
        // one method to brute force is
        int counter = 3;
        placeholder[0] = nums[0];
        for (int i = 1; i < n; i++) {
            //compare placeholder value with the next value in array
            // if it's less, then continue, if it's more, then return false
            if (counter == 0) {
                break;
            }
            if (placeholder[i - 1] < nums[i]) {
                System.out.println("nums[i]: " + nums[i]);
                System.out.println("placeholder[i - 1]" + placeholder[i - 1]);
                counter--;
            }
        }
        System.out.println(counter);
        return counter == 0;
        // check each value in the array, and compare with before
        // and also check if 
    }
}