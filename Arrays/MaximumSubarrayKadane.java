/*
Problem Statement:
Given an integer array nums, find the contiguous subarray (containing at least one number)
which has the largest sum and return its sum.

This problem is solved using Kadane’s Algorithm.

Input:
First line  : Integer n (size of array)
Second line : n integers (elements of the array)

Output:
Single integer representing the maximum subarray sum

Example:
Input:
9
-2 1 -3 4 -1 2 1 -5 4

Output:
6
*/

import java.util.Scanner;

public class MaximumSubarrayKadane {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();

        // Read array elements
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Kadane's Algorithm
        int curr = nums[0];   // max subarray sum ending at current index
        int maxi = nums[0];   // max subarray sum found so far

        for (int i = 1; i < n; i++) {
            // Either extend the previous subarray or start a new one
            curr = Math.max(curr + nums[i], nums[i]);

            // Update global maximum
            maxi = Math.max(maxi, curr);
        }

        // Output result
        System.out.println(maxi);

        sc.close();
    }
}
