class Solution {
    public String reverseWords(String s) {
        // trim the words
        String trimmed = s.trim();
        // split the string into individual words
        String[] words = trimmed.split("\\s+");
        // reverse the solution
        int start = 0;
        int end = words.length - 1;
        while (start < end) {
            String temp = words [start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
        // concatenate all of them back
        String result = String.join(" ", words);
        return result;
    }
}