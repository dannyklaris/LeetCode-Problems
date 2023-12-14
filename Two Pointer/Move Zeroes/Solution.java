public class Solution {
    // given array nums
    // move all 0s to the end
    public void moveZeroes(int[] nums) {
    
        // Initialize two pointers
        // Pointer 'i' starts from the beginning of the array
        int i = 0;    
    
        // Iterate through the array with a for-loop
        for (int j = 0; j < nums.length; j++) {
            // Check if the current element is non-zero
            if(nums[j] != 0) {
                if (i != j) {
                    swap(nums, i, j);
                }
                i++;
                // If the element at 'j' is non-zero, and 'i' is not the same as 'j', swap them
                // This moves the non-zero element to the 'i' position
                // and the zero element to the 'j' position
                
                // Increment 'i' after the swap (or if the element at 'j' was already non-zero)
                // This ensures 'i' always points to the next position where a non-zero element should go
            }
                
                
            
            // Note: If the element is zero, do nothing, just move 'j' forward
        
    
        // After the loop, all non-zero elements are in front while maintaining their relative order
        // and all zeros are moved to the end
        }
            
    }
    
    // Helper method to swap elements in the array
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    
}
