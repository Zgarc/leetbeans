package L347;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestCases {

    @Test
    public void emptyArray() {
        int[] input = new int[]{};
        int[] expected = new int[]{};
        int[] result = Solution.topKFrequent(input, 2);
        assertArrayEquals(result, expected);
    }

    @Test
    public void oneElement() {
        int[] input = new int[]{1};
        int[] expected = new int[]{1};
        int[] result = Solution.topKFrequent(input, 1);
        assertArrayEquals(result, expected);
    }

    @Test
    public void test1() {
        int[] input = new int[]{1, 1, 1, 2, 2, 3};
        int[] expected = new int[]{1, 2};
        int[] result = Solution.topKFrequent(input, 2);
        assertArrayEquals(result, expected);
    }

    @Test
    public void test2() {
        int[] input = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4};
        int[] expected = new int[]{1, 2, 3};
        int[] result = Solution.topKFrequent(input, 3);
        assertArrayEquals(result, expected);
    }

    @Test
    public void test3() {
        int[] input = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 4, 4, 4, 4, 1, 1, 1, 2, 3, 7, 8};
        int[] expected = new int[]{5, 4};
        int[] result = Solution.topKFrequent(input, 2);
        assertArrayEquals(result, expected);
    }

}