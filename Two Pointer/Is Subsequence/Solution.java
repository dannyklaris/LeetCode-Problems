public class Solution {
    /**
     * Checks if 's' is a subsequence of 't'.
     * 
     * @param s the string to check if it is a subsequence
     * @param t the string to check within for the subsequence
     * @return true if 's' is a subseqence of 't', false otherwise
     */
    public boolean isSubsequence(String s, String t) {
        // Check for null or empty strings as edge cases
        if (s == null || t == null) {
            return false;
        }

        if (s.isEmpty()) {
            return false;
        }
        
        // Initialize pointers for both strings 's' and 't'
        int sPointer = 0;
        int tPointer = 0;
        // Use a while loop to iterate over the string 't' with one pointer
        while (tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
                if(sPointer == s.length()) {
                    return true;
                }
            }
            tPointer++;
            // Inside the loop, compare the current character of 't' with the current character of 's'
                     
            // If characters match, increment the pointer for 's'
    
            // Increment the pointer for 't' after each iteration of the loop
    
            // Check if all characters in 's' have been traversed (i.e., if the pointer for 's' has reached the end of 's')
    
                // If so, return true indicating 's' is a subsequence of 't'
        }
            
        
            
    
        // If the loop completes and 's' has not been fully traversed, return false
    
        return false; // Placeholder for return statement
    }
    
}
