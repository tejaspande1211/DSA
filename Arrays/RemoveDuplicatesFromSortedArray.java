/*
Problem Statement:
Given a sorted integer array, remove duplicates in-place
such that each unique element appears only once.

Input:
First line  : Integer n (size of array)
Second line : n integers (sorted array elements)

Output:
First line  : Number of unique elements
Second line : Array after removing duplicates (first k elements)

Example:
Input:
5
1 1 2 2 3

Output:
3
1 2 3
*/

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Pointer for unique elements
        int k = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        // Output number of unique elements
        System.out.println(k);

        // Output unique elements
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
