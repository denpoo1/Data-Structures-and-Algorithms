package org.example.LeetCodeProblems.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapProblems {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        String s1 = "rat";
        String t1 = "car";

        String s2 = "anagram";
        String t2 = "nagaram";


        System.out.println(isAnagram(s1, t1));
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] wordsArray = s.split("\\s+");
        if (pattern.length() != wordsArray.length) return false;
        for (int x = 0; x < pattern.length(); x++) {
            if (map.containsKey(pattern.charAt(x))) {
                if (!map.get(pattern.charAt(x)).equals(wordsArray[x])) {
                    return false;
                }
            } else {
                if (map.containsValue(wordsArray[x])) {
                    return false;
                }
                map.put(pattern.charAt(x), wordsArray[x]);
            }
        }
        return true;
    }

//    Example 1:
//
//    Input: ransomNote = "a", magazine = "b"
//    Output: false
//    Example 2:
//
//    Input: ransomNote = "aa", magazine = "ab"
//    Output: false
//    Example 3:
//
//    Input: ransomNote = "aa", magazine = "aab"
//    Output: true

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        HashMap<Character, Integer> ransomNoteMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        int count = 1;

        for (int x = 0; x < ransomNote.length(); x++) {
            if (!ransomNoteMap.containsKey(ransomNote.charAt(x))) {
                ransomNoteMap.put(ransomNote.charAt(x), count);
            } else {
                int newValue = ransomNoteMap.get(ransomNote.charAt(x)) + 1;
                ransomNoteMap.put(ransomNote.charAt(x), newValue);
            }
        }

        for (int y = 0; y < magazine.length(); y++) {
            if (!magazineMap.containsKey(magazine.charAt(y))) {
                magazineMap.put(magazine.charAt(y), count);
            } else {
                int newValue = magazineMap.get(magazine.charAt(y)) + 1;
                magazineMap.put(magazine.charAt(y), newValue);
            }
        }

        for (Map.Entry entry : ransomNoteMap.entrySet()) {
            if (ransomNoteMap.get(entry.getKey()) == null || magazineMap.get(entry.getKey()) == null) return false;
            else if (ransomNoteMap.get(entry.getKey()) > magazineMap.get(entry.getKey())) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapperIsomorphic = new HashMap<>();
        for (int x = 0; x < s.length(); x++) {
            if (mapperIsomorphic.containsValue(t.charAt(x)) || mapperIsomorphic.containsKey(s.charAt(x))) {
                if (!mapperIsomorphic.containsKey(s.charAt(x))) return false;
                else if (!mapperIsomorphic.get(s.charAt(x)).equals(t.charAt(x))) return false;
            } else {
                mapperIsomorphic.put(s.charAt(x), t.charAt(x));
            }
        }
        return true;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x = 0; x < nums.length; x++) {
            if (map.containsKey(nums[x])) {
                if (Math.abs(map.get(nums[x]) - x) <= k) return true;
            }
            map.put(nums[x], x);
        }
        return false;
    }

//    Example 1:
//
//    Input: s = "anagram", t = "nagaram"
//    Output: true
//    Example 2:
//
//    Input: s = "rat", t = "car"
//    Output: false

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> mapLetter = new HashMap<>();
        for (int x = 0; x < s.length(); x++) {
            if (mapLetter.containsKey(s.charAt(x))) mapLetter.put(s.charAt(x), mapLetter.get(s.charAt(x)) + 1);
            else mapLetter.put(s.charAt(x), 1);
        }

        for (int x = 0; x < t.length(); x++) {
            if (!mapLetter.containsKey(t.charAt(x))) return false;
            else if (mapLetter.get(t.charAt(x)) - 1 == -1) return false;
            mapLetter.put(t.charAt(x), mapLetter.get(t.charAt(x)) - 1);
        }
        return true;
    }
}
