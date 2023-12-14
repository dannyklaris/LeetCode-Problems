import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        kidsWithCandies(candies, 3);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highestCandy = 1;
        List<Boolean> booleans = new ArrayList<>();
        // find maximum
        // O(n)
        for (int i = 0; i < candies.length; i++) {
            if (highestCandy <= candies[i]) {
                highestCandy = candies[i];
            }
        }
        // O(n)
        for (int i = 0; i < candies.length; i++) {
            int total = extraCandies + candies[i];
            System.out.println("total: " + total);
            if (total >= highestCandy) {
                booleans.add(true);
            }
            else{
                booleans.add(false);
            }
        }
        System.out.println(booleans);
        return booleans;
    }
}

// overall time complexity is O(n) + O(n) which simplifies to O(n) because you drop constants in Big O notation.

// time taken to execute the function scales linearly with the size of the input of the array 'candies'
// space complexity is O(n) as well, as the space taken by the booleans list which will have the same number of elements as the input array candies.