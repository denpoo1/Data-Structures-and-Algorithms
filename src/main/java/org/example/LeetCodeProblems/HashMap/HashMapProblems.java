package org.example.LeetCodeProblems.HashMap;

import java.util.*;

public class HashMapProblems {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;

        System.out.println(mergeTwoLists(node1, node4));
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

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    private static int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        ListNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            if (seen.contains(currentNode)) return true;
            else seen.add(currentNode);
        }
        return false;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode mergedHead;

        if (list1.val < list2.val) {
            mergedHead = new ListNode(list1.val);
            mergedHead.next = mergeTwoLists(list1.next, list2);
        } else {
            mergedHead = new ListNode(list2.val);
            mergedHead.next = mergeTwoLists(list1, list2.next);
        }

        return mergedHead;
    }
}
