/*
Question:
Remove Duplicates from Unsorted Array

Given an array arr[] of integers which may or may not contain duplicate elements.
Your task is to remove duplicate elements and return the array with only distinct elements.

The order of elements should be preserved as in the original array.

Example 1:
Input:
arr = [1, 2, 3, 1, 4, 2]

Output:
[1, 2, 3, 4]

Explanation:
1 and 2 appear more than once, so duplicates are removed.


Example 2:
Input:
arr = [1, 2, 3, 4]

Output:
[1, 2, 3, 4]

Explanation:
No duplicate elements present.
*/

import java.util.*;

public class RemoveDuplicatesFromUnsortedArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 1, 4, 2};
        int[] arr2 = {1, 2, 3, 4};

        System.out.println(removeDuplicate(arr1)); // Expected: [1, 2, 3, 4]
        System.out.println(removeDuplicate(arr2)); // Expected: [1, 2, 3, 4]
    }

    public static ArrayList<Integer> removeDuplicate(int[] arr) {

        // LinkedHashSet:
        // 1. Removes duplicates
        // 2. Preserves insertion order
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        return new ArrayList<>(set);
    }
}