package L125;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCases {

    @Test
    public void emptyString() {
        String input = "";
        assertTrue(Solution.isPalindrome(input));
    }

    @Test
    public void blankString() {
        String input = "    ";
        assertTrue(Solution.isPalindrome(input));
    }

    @Test
    public void test1() {
        String input = "A man, a plan, a canal: Panama";
        assertTrue(Solution.isPalindrome(input));
    }

    @Test
    public void test3() {
        String input = "race car";
        assertTrue(Solution.isPalindrome(input));
    }

    @Test
    public void test2() {
        String input = "race a car";
        assertFalse(Solution.isPalindrome(input));
    }
}
