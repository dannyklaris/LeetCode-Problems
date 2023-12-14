public class Solution {

    /**
     * find two lines that together with x-axis form a container, such that the container contains the most water
     * 
     * @param height
     * @return maximum area found
     */
    public int maxArea(int[] height) {
        // Initialize two pointers, one at the start and one at the end of the array
        int i = 0;
        int j = height.length - 1;
        // Initialize a variable to keep track of the maximum area found
        int maximumArea = Integer.MIN_VALUE;
    
        // Use a while loop to iterate as long as the start pointer is less than the end pointer
        while (i < j) {
            // Calculate the width of the current container (difference between pointers)
            int widthCurrent = j - i;
            // Calculate the height of the current container
            // The height is the minimum of the two lines pointed by the two pointers
            int heightCurrent = Math.min(height[i], height[j]);
            // Calculate the area of the current container (width multiplied by height)
            int area = widthCurrent * heightCurrent;
            // Update the maximum area if the current area is greater than the maximum found so far
            maximumArea = Math.max(maximumArea, area);
            // Move the pointer pointing to the shorter line inward
            // This is because moving the longer line inward cannot increase the area
            if (height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
            
        }
            
    
        // Continue the loop until the two pointers meet
    
        // Return the maximum area found
        return maximumArea;
    }
    
}
