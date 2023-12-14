public class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0, currentVowels = 0;

        // Initialize the count of vowels in the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }
        maxVowels = currentVowels;

        // Slide the window and update the counts
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                currentVowels--;
            }
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }

    // Helper function to check if a character is a vowel
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
