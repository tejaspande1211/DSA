/*
Problem: Second Largest Element in Array

Description:
Given an array of positive integers, return the second largest
distinct element in the array.
If it does not exist, return -1.

Input Format:
First line contains integer n
Second line contains n space-separated integers

Output Format:
Print second largest distinct element or -1

Example 1:
Input:
6
12 35 1 10 34 1
Output:
34

Example 2:
Input:
3
10 10 10
Output:
-1
*/

import java.util.*;

public class SecondLargest {

    /*
     * -------------------------------
     * METHOD 1: Optimal (One Pass)
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * -------------------------------
     */
    static int getSecondLargestOptimal(int[] arr) {

        if (arr.length < 2)
            return -1;

        int largest = -1;
        int second = -1;

        for (int num : arr) {

            if (num > largest) {
                second = largest;
                largest = num;
            } 
            else if (num > second && num != largest) {
                second = num;
            }
        }

        return second;
    }


    /*
     * -------------------------------
     * METHOD 2: Sorting Approach
     * Time Complexity: O(n log n)
     * Space Complexity: O(1)
     * (Less efficient but simple)
     * -------------------------------
     */
    /*
    static int getSecondLargestSorted(int[] arr) {

        if (arr.length < 2)
            return -1;

        Arrays.sort(arr);

        int largest = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i];
            }
        }

        return -1; // all elements equal
    }
    */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Using Optimal Method
        int result = getSecondLargestOptimal(arr);

        System.out.println(result);

        sc.close();
    }
}