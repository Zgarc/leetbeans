package L3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {

    @Test
    public void test1() {
        final String input = "abcabcbb";

        final int output = Solution.lengthOfLongestSubstring(input);

        assertEquals(3, output);
    }
}
