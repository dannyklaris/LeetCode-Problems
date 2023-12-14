public class AlternativeSolution {
    // check if there's no common string
    public static String gcdOfStrings(String str1, String str2) {
        // O(n + m), where n is the length of str1 and m is the length of str2, this is because the equals method compares the two concatenated strings character by character
        if(!(str1 + str2).equals(str2 + str1)) {
        return "";
    }
    // using euclidean algorithm
    int gcdLength = gcd(str1.length(), str2.length());

    // substring operation is O(k) where k is the length of substring being taken. in this case, since the substring is taken from the beginning of str1 to the length of GCD, the complexity is O(gcdLength).
    // return substring from beginning to the gcd length
    return str1.substring(0, gcdLength);
}

// gcd uses euclidean algorithm, which has time complexity of O(log(min(n,m))), since the worst case is the number of operations required to find the GCD is proportional to the number of digits in the smaller number.
public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
    
}

// the dominant part is the initial string comparison, making the total time complexity O(n + m).
