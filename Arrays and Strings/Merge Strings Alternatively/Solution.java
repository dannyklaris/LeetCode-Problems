class Solution {

    public static void main(String[] args) {
        mergeAlternately("bob","danny");
    }

    public static String mergeAlternately(String word1, String word2) {
        // initializes a StringBuilder object, this operation does not depend on the size of the input and takes a constant amount of time. O(1)
        StringBuilder sb = new StringBuilder();
        // getting the length of a string is a constant time operation, O(1), because the length information is stored with the string object
        int word1Length = word1.length();
        int word2Length = word2.length();
        // constant time operation, O(1), it's just comparing two numbers.
        int longerWords = Math.max(word1Length, word2Length);
        String result = "";

        // since we append each character both strings once for each loop iteration and you loop 'n' times, the time complexity for it is O(n), where n is the length of the longer string.
        for (int i = 0; i < longerWords; i++) {
            // checking if i less than word1Length is O(1) as they're simple comparisons.
            if (i < word1Length) {
                System.out.println(word1.charAt(i));
                sb.append(word1.charAt(i));

            }
            // O(1)
            if (i < word2Length) {
                System.out.println(word2.charAt(i));
                sb.append(word2.charAt(i));
            }
            
        }
        // it's a linear operation, O(n) where 'n' is the total number of characters that have been appended to the StringBuilder. it's linear because it needs to copy each character into a new 'String' object.
        result = sb.toString();
        return result;
    }
}

// overall time complexity is O(n), the toString() method at the end does not change the overall time complexity because it's still dependent on the size of the combined input, which is also 'n'.

// space complexity is O(n) because the StringBuilder needs to store all the characters from both word1 and word2.

// final thoughts:
// this method is O(n) where n is the length of the longer string between word1 and word2. this is because the number of operations grows linearly with the length of the longer string.