public class AlternativeSolution {
    public String reverseWords(String s) {
        // Trim leading/trailing spaces and split the string by spaces
        String[] words = s.trim().split("\\s+");
        
        // Use StringBuilder for efficient string concatenation
        StringBuilder reversed = new StringBuilder();
        
        // Append the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) { // Add a space if it's not the last word
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
}
