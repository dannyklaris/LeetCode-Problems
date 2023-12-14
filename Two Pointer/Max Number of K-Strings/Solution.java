import java.util.HashMap;



public class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int operations = 0;

        for (int num : nums) {
            int complement = k - num;

            // Check if the complement exists and has a non-zero frequency
            if (frequencyMap.getOrDefault(complement, 0) > 0) {
                operations++;  // Increment the count of operations
                frequencyMap.put(complement, frequencyMap.get(complement) - 1);  // Decrease the frequency of the complement
            } else {
                // Increment the frequency of the current number
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }

        return operations;
    }
}
