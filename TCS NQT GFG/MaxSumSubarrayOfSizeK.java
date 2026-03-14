/*
Question:
Max Sum Subarray of Size K

Given an array of integers arr[] and a number k,
return the maximum sum of a subarray of size k.

Note:
A subarray is a contiguous part of an array.

Example 1:
Input:
arr = [100, 200, 300, 400]
k = 2

Output:
700

Explanation:
300 + 400 = 700 (maximum sum of size 2)


Example 2:
Input:
arr = [1, 4, 2, 10, 23, 3, 1, 0, 20]
k = 4

Output:
39

Explanation:
4 + 2 + 10 + 23 = 39


Example 3:
Input:
arr = [100, 200, 300, 400]
k = 1

Output:
400
*/

import java.util.*;

public class MaxSumSubarrayOfSizeK {

    public static void main(String[] args) {

        int[] arr1 = {100, 200, 300, 400};
        int[] arr2 = {1, 4, 2, 10, 23, 3, 1, 0, 20};

        System.out.println(maxSubarraySum(arr1, 2)); // Expected: 700
        System.out.println(maxSubarraySum(arr2, 4)); // Expected: 39
    }

    public static int maxSubarraySum(int[] arr, int k) {

        int n = arr.length;

        // Edge case: invalid k
        if (k > n || k <= 0) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        // Step 1: Compute first window sum
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {

            // Add next element
            windowSum += arr[i];

            // Remove element that slides out
            windowSum -= arr[i - k];

            // Update maximum
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}