package L3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        List<Character> substring = new ArrayList<>();
        int largestlength = 0;
        for (int right = 0; right < s.length(); right++) {
            if (substring.contains(s.charAt(right))) {
                int index = substring.indexOf(s.charAt(right));
                substring.remove(index);
                if (index > 0) {
                    substring.subList(0, index).clear();
                }
            }
            substring.add(s.charAt(right));
            largestlength = Math.max(largestlength, substring.size());
        }
        return largestlength;
    }
}
