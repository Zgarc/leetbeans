package L49;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TestCases {

    @Test
    public void emptyList() {
        String[] input = new String[]{};
        List<List<String>> output = L49.groupAnagrams(input);

        List<List<String>> expected = Arrays.asList();

        assertEqual(output, expected);
    }

    @Test
    public void emptyString() {
        String[] input = new String[]{""};
        List<List<String>> output = L49.groupAnagrams(input);

        List<List<String>> expected = Arrays.asList(list(""));

        assertEqual(output, expected);
    }

    @Test
    public void singleCharacter() {
        String[] input = new String[]{"a"};
        List<List<String>> output = L49.groupAnagrams(input);

        List<List<String>> expected = Arrays.asList(list("a"));

        assertEqual(output, expected);
    }

    @Test
    public void test1() {
        String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> output = L49.groupAnagrams(input);

        List<List<String>> expected =
                Arrays.asList(
                        list("bat"),
                        list("tan", "nat"),
                        list("tea", "ate", "eat")
                );

        assertEqual(output, expected);
    }

    @Test
    public void test2() {
        String[] input = new String[]{"cat", "act", "beak", "bake", "meats", "steam", "race"};
        List<List<String>> output = L49.groupAnagrams(input);

        List<List<String>> expected = Arrays.asList(
                list("cat", "act"),
                list("beak", "bake"),
                list("steam", "meats"),
                list("race")
        );

        assertEqual(output, expected);
    }

    private List<String> list(String... strings) {
        List<String> stringList = new ArrayList<>();

        if (strings.length == 0) return stringList;

        stringList.addAll(Arrays.asList(strings));

        return stringList;
    }

    private static void assertEqual(List<List<String>> list1, List<List<String>> list2) {
        // sort nested lists in both
        list1.forEach(Collections::sort);
        list2.forEach(Collections::sort);

        if (list1.size() != list2.size()) fail();

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        list1.forEach(list -> set1.add(list.toString()));

        list2.forEach(list -> set2.add(list.toString()));

        list1.forEach(list -> assertTrue(set2.contains(list.toString())));
        list2.forEach(list -> assertTrue(set1.contains(list.toString())));
    }

}
