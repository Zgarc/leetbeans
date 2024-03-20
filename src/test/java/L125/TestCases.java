package L125;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCases {

    @Test
    public void emptyString() {
        String input = "";
        assertTrue(L125.isPalindrome(input));
    }

    @Test
    public void blankString() {
        String input = "    ";
        assertTrue(L125.isPalindrome(input));
    }

    @Test
    public void test1() {
        String input = "A man, a plan, a canal: Panama";
        assertTrue(L125.isPalindrome(input));
    }

    @Test
    public void test3() {
        String input = "race car";
        assertTrue(L125.isPalindrome(input));
    }

    @Test
    public void test2() {
        String input = "race a car";
        assertFalse(L125.isPalindrome(input));
    }
}
