package L1;

import java.util.HashMap;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> traversed = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if(traversed.containsKey(compliment)) return new int[]{traversed.get(compliment), i};
            else traversed.put(nums[i], i);
        }
        return null;
    }
}
