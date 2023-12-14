public class CorrectedSolution {
    int compress(char[] chars) {
        if (chars.length == 1) {
            return 1; 
            // if only one character, the compressed length is 1
        }

        int writeIndex = 0; 
        // index to write to the chars
        int readIndex = 0;
        // index for reading from the chars

        while (readIndex < chars.length) {
            char currentChar = chars[readIndex];
            int count = 0;

            // count number of times the current character repeats itself
            while (readIndex < chars.length && chars[readIndex] == currentChar) {
                readIndex++;
                count++;
            }

            // write character to the array
            chars[writeIndex++] = currentChar;

            //write count if it is greater than 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[writeIndex++] = c;
                }
            }
        }
        return writeIndex;
    }
}
