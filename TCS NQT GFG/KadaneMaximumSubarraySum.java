/*
Question:
Kadane's Algorithm

You are given an integer array arr[].
Find the maximum sum of a subarray (containing at least one element).

Note:
A subarray is a contiguous part of an array.

Example 1:
Input:
arr = [2, 3, -8, 7, -1, 2, 3]

Output:
11

Explanation:
The subarray [7, -1, 2, 3] has the largest sum = 11.


Example 2:
Input:
arr = [-2, -4]

Output:
-2

Explanation:
The subarray [-2] has the largest sum = -2.
*/

import java.util.*;

public class KadaneMaximumSubarraySum {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, -8, 7, -1, 2, 3};
        int[] arr2 = {-2, -4};

        System.out.println(maxSubArraySum(arr1)); // Expected: 11
        System.out.println(maxSubArraySum(arr2)); // Expected: -2
    }

    public static int maxSubArraySum(int[] arr) {

        // Step 1: Initialize with first element
        int currentSum = arr[0];  // max subarray ending at current index
        int maxSum = arr[0];      // best sum seen so far

        // Step 2: Traverse from second element
        for (int i = 1; i < arr.length; i++) {

            // Either extend previous subarray or start fresh
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update global maximum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}