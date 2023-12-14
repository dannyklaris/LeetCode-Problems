import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // count freq of each elem
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        Set<Integer> seenFreq = new HashSet<>();

        // check if freq are unique
        for (int freq : freqMap.values()) {
            if (seenFreq.contains(freq)) {
                return false;
            }
            seenFreq.add(freq);
        }
        return true;
    }
}