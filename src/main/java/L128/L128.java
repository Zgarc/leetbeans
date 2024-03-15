package L128;

import java.util.HashSet;
import java.util.Set;

public class L128 {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int longest = 1;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    num++; // iterate to the next number
                    count++; // iterate size of sequence
                }
                longest = Math.max(longest, count);
            }
            if (longest > nums.length / 2) break;

        }
        return longest;
    }
}
