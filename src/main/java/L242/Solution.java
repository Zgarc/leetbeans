package L242;

public class Solution {
//    public static boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()) return false;
//
//        HashMap<Character, Integer> sMap = new HashMap<>();
//        HashMap<Character, Integer> tMap = new HashMap<>();
//
//        for(int i = 0; i < s.length(); i++) {
//            char sChar = s.charAt(i);
//            char tChar = t.charAt(i);
//            sMap.put(sChar, sMap.getOrDefault(sChar, 0) + 1);
//            tMap.put(tChar, tMap.getOrDefault(tChar, 0) + 1);
//        }
//
//        return sMap.equals(tMap);
//
//    }

//    public static boolean isAnagram(String s, String t) {
//        char[] s_array = s.toCharArray();
//        char[] t_array = t.toCharArray();
//
//        Arrays.sort(s_array);
//        Arrays.sort(t_array);
//
//        return Arrays.equals(s_array,t_array);
//    }

    public static boolean isAnagram(String stringOne , String stringTwo){
        // eat
        // tea
        // if length of strings is not same
        if (stringOne.length() != stringTwo.length()) return false;

        int[] counts = new int[26];
        for (int i = 0; i < stringOne.length(); i++){
            counts[stringOne.charAt(i)-'a']++;
            counts[stringTwo.charAt(i)-'a']--;
        }
        for (int i = 0; i<26; i++) {
            if (counts[i] != 0) return false;
        }
        return true;
    }

}
