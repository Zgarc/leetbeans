package L703;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {
    @Test
    public void test1() {
        L703 kthLargest = new L703(3, new int[]{4, 5, 8, 2});
        assertEquals(kthLargest.add(3), 4);   // return 4
        assertEquals(kthLargest.add(5), 5);   // return 5
        assertEquals(kthLargest.add(10), 5);  // return 5
        assertEquals(kthLargest.add(9), 8);   // return 8
        assertEquals(kthLargest.add(4), 8);   // return 8
    }

    @Test
    public void test2() {
        L703 kthLargest = new L703(3, new int[]{3, 7, 8, 1});
        // first they get sorted:
        // 1, 3, 7, 8

        // 1, 3, 3, 7, 8
        assertEquals(kthLargest.add(3), 3);
        // 1, 3, 3, 5, 7, 8
        assertEquals(kthLargest.add(5), 5);
        // 1, 3, 3, 5, 7, 8, 10
        assertEquals(kthLargest.add(10), 7);
        // 1, 3, 3, 5, 7, 8, 9, 10
        assertEquals(kthLargest.add(9), 8);
        // 1, 3, 3, 4, 5, 7, 8, 9, 10
        assertEquals(kthLargest.add(4), 8);
    }
}
