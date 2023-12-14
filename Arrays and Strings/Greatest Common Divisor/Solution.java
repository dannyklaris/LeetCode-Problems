class Solution {
    public static void main(String[] args) {
        gcdOfStrings("ABABAB", "AB");
    }
    public static String gcdOfStrings(String str1, String str2) {
        int gcd = 0;
        // find the GCD of str1 and str2
        // O(min(n,m))
        for(int i = 1; i <= str1.length() && i <= str2.length(); i++) {
            if (str1.length() % i == 0 && str2.length()%i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
        //
        String substr1 = str1.substring(0, gcd);
        System.out.println(substr1);
        int x = str1.length() / substr1.length();
        int y = str2.length() / substr1.length();
        // now you can multiply the substr1
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        // O(n)
        for (int i = 0; i < x; i++) {
            sb.append(substr1);
            
        }
        //O(n)
        for (int i = 0; i < y; i++) {
            sb2.append(substr1);   
        }
        System.out.println("sb is " + sb);
        System.out.println("sb2 is " + sb2);
        System.out.println(sb2);
        if (sb.toString().equals(str1) && sb2.toString().equals(str2)) {
            System.out.println("the coniditons " + substr1);
            return substr1;
        }
        else {
            System.out.println("not satisfy");
            return "";
        }
        
    }
}

// overall time complexity is O(n^3)?