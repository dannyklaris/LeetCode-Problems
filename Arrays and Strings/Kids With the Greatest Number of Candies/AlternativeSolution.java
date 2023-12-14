import java.util.ArrayList;
import java.util.List;

public class AlternativeSolution {
    public static void main(String[] args) {
        
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highestCandy = 0;
        List<Boolean> booleans = new ArrayList<>(candies.length);

        // find max number of candies using for loop and Math.max
        // O(n)
        for (int candy : candies) {
            highestCandy = Math.max(highestCandy,candy);
        }
        // determine if each kid can have the greatest number of candies
        // O(n)
        for (int candy : candies) {
            booleans.add(candy + extraCandies >= highestCandy);
        }
        return booleans;
    }
}
