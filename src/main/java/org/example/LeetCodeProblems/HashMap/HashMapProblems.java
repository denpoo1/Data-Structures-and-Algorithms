package org.example.LeetCodeProblems.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapProblems {
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "d";
//        System.out.println(canConstruct(ransomNote, magazine));
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
}
