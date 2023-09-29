package org.example.DataStructures;

public class Test {


    /**Returns the closest repeating element**/
    public static Object firstRecurringCharacter(Object[] input) {
        for(int x = 0; x < input.length; x++) {
            for(int y = x + 1; y < input.length;y++) {
                if(input[x].equals(input[y]))
                    return input[x];
            }
        }
        return null;
    }
}
