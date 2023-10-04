package org.example.Algorithms.LeetCode;

class Solution {
    public int removeDuplicates(int[] nums) {
        int countNewArray = 0;
        int[] newArray = new int[nums.length];
        newArray[countNewArray++] = nums[0];
        for(int x = 1; x < nums.length; x++) {
            if(newArray[countNewArray] != nums[x]) {
                newArray[countNewArray++] = nums[x];
            }
        }
        return countNewArray;
    }
}