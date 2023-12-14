import java.util.*;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        // find distinct elemnts in nums1
        List<Integer> differentNums1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                differentNums1.add(num);
            }
        }

        // find different elements in nums2
        List<Integer> differentNums2 = new ArrayList<>();
        for (int num : set2) {
            if(!set1.contains(num)){
                differentNums2.add(num);
            }
        }

        // final answer
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(differentNums1);
        answer.add(differentNums2);

        return answer;
    }
}
