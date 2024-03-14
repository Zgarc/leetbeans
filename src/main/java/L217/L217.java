package L217;

import java.util.HashSet;

public class L217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> iterated = new HashSet<>();

        for(int n: nums) {
            if(iterated.contains(n)) return true;
            else iterated.add(n);
        }
        return false;
    }
}
