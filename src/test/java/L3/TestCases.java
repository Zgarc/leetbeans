package L3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {
    @Test
    public void emptyString() {
        final String input = "";

        final int output = Solution.lengthOfLongestSubstring(input);

        assertEquals(0, output);
    }

    @Test
    public void oneCharacterString() {
        final String input = "a";

        final int output = Solution.lengthOfLongestSubstring(input);

        assertEquals(1, output);
    }

    @Test
    public void test1() {
        final String input = "abcabcbb";

        final int output = Solution.lengthOfLongestSubstring(input);

        assertEquals(3, output);
    }

    @Test
    public void test2() {
        final String input = "cadtrefffffff";

        final int output = Solution.lengthOfLongestSubstring(input);

        assertEquals(7, output);
    }
}
