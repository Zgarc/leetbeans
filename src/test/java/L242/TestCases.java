package L242;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestCases {
    /**
     * All of these are anagrams
     */
    @Test
    public void test1() {
        assertTrue(Solution.isAnagram("car", "rac"));
        assertTrue(Solution.isAnagram("anagram", "nagaram"));
        assertTrue(Solution.isAnagram("tea", "eat"));
        assertTrue(Solution.isAnagram("ate", "tea"));
        assertTrue(Solution.isAnagram("race", "erac"));
        assertTrue(Solution.isAnagram("racecar", "carecar"));
        assertTrue(Solution.isAnagram("tree", "rete"));
        assertTrue(Solution.isAnagram("sat", "ast"));
    }
    /**
     * None of these are anagrams
     */
    @Test
    public void test2() {
        assertFalse(Solution.isAnagram("car", "race"));
        assertFalse(Solution.isAnagram("tea", "rat"));
        assertFalse(Solution.isAnagram("ate", "at"));
        assertFalse(Solution.isAnagram("sar", "as"));
        assertFalse(Solution.isAnagram("as", "tt"));
        assertFalse(Solution.isAnagram("qq", "tt"));
        assertFalse(Solution.isAnagram("tree", "apple"));
        assertFalse(Solution.isAnagram("sat", "thunder"));
    }
}
