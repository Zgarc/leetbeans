package L128;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {
    @Test
    public void emptyArray() {
        int[] sequence = new int[]{};
        int longestSequence = Solution.longestConsecutive(sequence);
        assertEquals(0, longestSequence);
    }

    @Test
    public void oneNumber() {
        int[] sequence = new int[]{1};
        int longestSequence = Solution.longestConsecutive(sequence);
        assertEquals(1, longestSequence);
    }

    @Test
    public void test1() {
        int[] sequence = new int[]{100, 4, 200, 1, 3, 2};
        int longestSequence = Solution.longestConsecutive(sequence);
        assertEquals(4, longestSequence);
    }

    @Test
    public void test2() {
        int[] sequence = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int longestSequence = Solution.longestConsecutive(sequence);
        assertEquals(9, longestSequence);
    }
}
