package L121;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {
    @Test
    public void emptyArray() {
        int[] prices = new int[]{};
        int maxProfit = L121.maxProfit(prices);

        assertEquals(0, maxProfit);
    }

    @Test
    public void oneElementArray() {
        int[] prices = new int[]{1};
        int maxProfit = L121.maxProfit(prices);

        assertEquals(0, maxProfit);
    }

    @Test
    public void test1() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int maxProfit = L121.maxProfit(prices);

        assertEquals(5, maxProfit);
    }

    @Test
    public void test2() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4, 9, 10, 11, 12};
        int maxProfit = L121.maxProfit(prices);

        assertEquals(11, maxProfit);
    }
}