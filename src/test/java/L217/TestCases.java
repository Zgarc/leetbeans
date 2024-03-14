package L217;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestCases {
    @Test
    public void test1() {
        int[] test1 = new int[]{1, 1, 2, 3, 4, 5, 6};

        assertTrue(L217.containsDuplicate(test1));
    }
    @Test
    public void test2() {
        int[] test2 = new int[]{1, 2, 3, 4, 5, 6};

        assertFalse(L217.containsDuplicate(test2));
    }
    @Test
    public void test3() {
        int[] test2 = new int[]{1, 7, 9, 11, 13, 15, 16, 123};

        assertFalse(L217.containsDuplicate(test2));
    }
    @Test
    public void test4() {
        int[] test2 = new int[]{1, 7, 9, 11, 13, 15, 16, 123, 123};

        assertTrue(L217.containsDuplicate(test2));
    }
}
