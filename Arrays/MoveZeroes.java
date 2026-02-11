/*
Problem Statement:
Given an integer array nums, move all 0's to the end of the array
while maintaining the relative order of the non-zero elements.

You must do this in-place without making a copy of the array.

Input:
First line  : Integer n (size of array)
Second line : n integers (elements of the array)

Output:
Array after moving all zeroes to the end

Example:
Input:
5
0 1 0 3 12

Output:
1 3 12 0 0
*/

import java.util.Scanner;

public class MoveZeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();

        // Read array elements
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Index to place next non-zero element
        int j = 0;

        // Move non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill remaining positions with zero
        while (j < n) {
            nums[j] = 0;
            j++;
        }

        // Print result
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
