package L121;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {
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