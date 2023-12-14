class Solution {

    public static void main(String[] args) {
        reverseVowels("hello");
    }
    public static String reverseVowels(String s) {
        // convert string to characters
        char[] characters = s.toCharArray();
        // check if vowels
        // two pointer method
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            // move if not vowels
            while (left < right && !isVowel(characters[left])) {
                left++;
            }
            while (left < right && !isVowel(characters[right])) {
                right--;
            }
            
            if (left < right) {
                char temp = characters[left];
                characters[left] = characters[right];
                characters[right] = temp;

                // move points after swap
                left++;
                right--;
            }
        }
        // convert characters to string back
        return new String(characters);
    }

    public static boolean isVowel(char ch) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(ch) != -1;
    }
}