package L49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class L49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        if (strs.length == 0) return result;

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] key = new int[26];
            for (Character c : str.toCharArray()) {
                key[c - 'a']++;
            }
            String keyString = Arrays.toString(key);
            map.computeIfAbsent(keyString, k -> new ArrayList<>());

            map.get(keyString).add(str);
        }

        result.addAll(map.values());

        return result;
    }
}
