class Solution {

    public static void main(String[] args) {
        int[] flowerbed = {0,0,1,0,1};
        System.out.println(canPlaceFlowers(flowerbed, 1));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        // we have arrays [], it contains 0s and 1s
        // 0s means empty, 1 means not empty
        // the condition is:
        // 1) checks if there's adjacent 1, if there is, you can't plant there
        // 2) if all is empty, 00000, you can plant at most 3 and at least 2
        // 3) if all have ones, 11111, can't plant, so return false
        // 4) if there is 000 in a sequence, you can plant at least 1
        // to appraoch this, we will check the sequences in the array
        // every 000 sequence, you can add 1
        // to simplify
        // check the first and third, so if the first and third is 0s, can put
        // 0001
        // iterate the flowerbed
        // checks for 0,0,0
        // init potentialplant = 0
        // O(n), iterate through each according to the length of flowerbed
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                return true;
            }
            i++;
            }
        }
        return n <= 0;
    }
}