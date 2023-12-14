class Solution {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));

    }
    public static int compress(char[] chars) {
        // problem statement
        // given array of char
        // compress it

        // initialization section
        int characters = 1;
        int n = chars.length;
        char[] compressed = new char[n];

        if (chars.length == 1) {
            return 1;
        }

        compressed[0] = chars[0];
        // iteration section
        // for each consecutive repeating characters in chars;
        // if (group's length is 1, append the character to s
        // else append character followed by group's length
        // constraints
        for (int i = 1; i < n; i++) {
            if (chars[i] == compressed[i-1]) {
                compressed[i - 1] = chars[i]; 
                characters++;
            }
            compressed[i] = characters;
            }
        System.out.println(compressed);
        

        // return section
        // compressed s should not returned separately, stored in the input charadter array chars.
        // group lengths that are 10 or longer will be split into multiple chararacters in chars
        //afte modify the input array, return new length of the array
        return compressed.length;
    }
}