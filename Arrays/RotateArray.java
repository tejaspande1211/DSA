/*
Problem Statement:
Given an integer array nums, rotate the array to the right by k steps.
Rotation must be done in-place.

Input:
First line  : Integer n (size of array)
Second line : n integers (array elements)
Third line  : Integer k (number of rotations)

Output:
Array after rotation

Example:
Input:
7
1 2 3 4 5 6 7
3

Output:
5 6 7 1 2 3 4
*/

import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        // Handle case where k >= n
        k = k % n;

        // Step 1: Reverse entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(nums, k, n - 1);

        // Print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }

    // Helper function to reverse part of the array
    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
