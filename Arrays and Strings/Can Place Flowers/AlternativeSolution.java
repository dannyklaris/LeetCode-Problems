public class AlternativeSolution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Handle trivial cases
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 0) {
            return false;
        }
        if (flowerbed.length == 1) {
            return flowerbed[0] == 0 && n <= 1;
        }
        
        // Iterate through the flowerbed
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if current plot is empty and if the adjacent plots are also empty (or if it's the first or last plot)
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                // Plant a flower here
                flowerbed[i] = 1;
                n--; // One less flower to plant
                
                // If we've planted all needed flowers, return true
                if (n == 0) {
                    return true;
                }
                
                // Skip the next plot since we can't plant adjacent to the newly planted flower
                i++;
            }
        }
        
        // If there are still flowers left to plant, return false
        return n <= 0;
    }

    public static void main(String[] args) {
        int[] flowerbed1 = {1, 0, 1, 0, 1, 0, 1};
        int n1 = 1;
        System.out.println("Can place flowers (Example 1): " + canPlaceFlowers(flowerbed1, n1)); // Expected: false
        
        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 1;
        System.out.println("Can place flowers (Example 2): " + canPlaceFlowers(flowerbed2, n2)); // Expected: true

        int[] flowerbed3 = {0, 0, 1, 0, 1};
        int n3 = 1;
        System.out.println("Can place flowers (Example 3): " + canPlaceFlowers(flowerbed3, n3)); // Expected: true
    }
}
