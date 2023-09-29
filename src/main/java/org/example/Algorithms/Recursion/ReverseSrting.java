package org.example.Algorithms.Recursion;

public class ReverseSrting {
    //Implement a function that reverses a string using iteration...and then recursion!

    public static String reverseStringIteration(String string) {
        char[] defaultString = string.toCharArray();
        String reverseString = "";
        int count = defaultString.length - 1;
        for (int x = 0; x < defaultString.length; x++) {
            reverseString += defaultString[count--];
        }
        return reverseString;
    }

public static String reverseStringRecursive(String input) {
    if (input.isEmpty() || input.length() == 1) {
        return input;
    }
    return reverseStringRecursive(input.substring(1)) + input.charAt(0);
}

    private static String removeLastCharacter(String input) {
        char[] charArray = input.toCharArray();
        if (charArray.length > 0) {
            char[] newArray = new char[charArray.length - 1];
            System.arraycopy(charArray, 0, newArray, 0, newArray.length);
            return new String(newArray);
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseStringRecursive("denis"));
    }
}
