package L1;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCases {

    @Test
    public void baseCase() {
        int[] test1 = new int[]{};

        assertArrayEquals(L1.twoSum(test1, 0), null);
    }
    @Test
    public void test1() {
        int[] test1 = new int[]{2, 7, 11, 15};

        assertArrayEquals(L1.twoSum(test1, 9), new int[]{0, 1});
    }

    @Test
    public void test2() {
        int target = 8;
        int[] test1 = new int[]{0, 1, 2, 6};

        assertArrayEquals(L1.twoSum(test1, target), new int[]{2, 3});
    }

    @Test
    public void test3() {
        int target = 24;
        int[] test1 = new int[]{0, 1, 2, 6, 9, 12, 20, 22};

        assertArrayEquals(L1.twoSum(test1, target), new int[]{2, 7});
    }
}
