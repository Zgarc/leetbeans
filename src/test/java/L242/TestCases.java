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
        assertTrue(L242.isAnagram("car", "rac"));
        assertTrue(L242.isAnagram("anagram", "nagaram"));
        assertTrue(L242.isAnagram("tea", "eat"));
        assertTrue(L242.isAnagram("ate", "tea"));
        assertTrue(L242.isAnagram("race", "erac"));
        assertTrue(L242.isAnagram("racecar", "carecar"));
        assertTrue(L242.isAnagram("tree", "rete"));
        assertTrue(L242.isAnagram("sat", "ast"));
    }
    /**
     * None of these are anagrams
     */
    @Test
    public void test2() {
        assertFalse(L242.isAnagram("car", "race"));
        assertFalse(L242.isAnagram("tea", "rat"));
        assertFalse(L242.isAnagram("ate", "at"));
        assertFalse(L242.isAnagram("sar", "as"));
        assertFalse(L242.isAnagram("as", "tt"));
        assertFalse(L242.isAnagram("qq", "tt"));
        assertFalse(L242.isAnagram("tree", "apple"));
        assertFalse(L242.isAnagram("sat", "thunder"));
    }
}
