/*
Question:
Non-Repeating Element

Find the first non-repeating element in a given array of integers.
If there is no non-repeating element, return 0.

Note:
The array consists of positive and negative integers (but not zero).

Example 1:
Input:
arr = [-1, 2, -1, 3, 2]

Output:
3

Explanation:
-1 repeats
2 repeats
3 occurs only once
So answer is 3.


Example 2:
Input:
arr = [1, 1, 1]

Output:
0

Explanation:
No non-repeating element exists.
*/

import java.util.*;

public class FirstNonRepeatingElementFinder {

    public static void main(String[] args) {

        int[] arr1 = {-1, 2, -1, 3, 2};
        int[] arr2 = {1, 1, 1};

        System.out.println(firstNonRepeating(arr1)); // Expected: 3
        System.out.println(firstNonRepeating(arr2)); // Expected: 0
    }

    public static int firstNonRepeating(int[] arr) {

        // Step 1: Count frequencies using LinkedHashMap
        // LinkedHashMap maintains insertion order
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Traverse array again to preserve original order
        for (int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }

        return 0;
    }
}