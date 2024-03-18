package L238;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestCases {
    @Test
    public void emptyArray() {
        int[] input = new int[]{};

        int[] expected = new int[]{};
        int[] actual = L238.productExceptSelf(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void oneNumber() {
        int[] input = new int[]{1};

        int[] expected = new int[]{1};
        int[] actual = L238.productExceptSelf(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void allZeros() {
        int[] input = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

        int[] expected = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        int[] actual = L238.productExceptSelf(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        int[] input = new int[]{1, 2, 3, 4};

        int[] expected = new int[]{24, 12, 8, 6};
        int[] actual = L238.productExceptSelf(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] input = new int[]{-1, 1, 0, -3, 3};

        int[] expected = new int[]{0, 0, 9, 0, 0};
        int[] actual = L238.productExceptSelf(input);

        assertArrayEquals(expected, actual);
    }
}
