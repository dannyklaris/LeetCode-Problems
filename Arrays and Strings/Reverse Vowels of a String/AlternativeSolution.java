public class AlternativeSolution {
    public String reverseVowels(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        String vowels = "aeiouAEIOU";
        char[] characters = s.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            while (left < right && vowels.indexOf(characters[left]) == -1) {
                left++;
            }

            while (left < right && vowels.indexOf(characters[right]) == -1) {
                right--;
            }

            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }

        return new String(characters);
    }
}
