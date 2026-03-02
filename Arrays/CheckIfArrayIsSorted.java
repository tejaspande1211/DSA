/*
Problem: Check if Array is Sorted

Description:
Given an array of integers, check whether it is sorted in non-decreasing order.
Return true if sorted, otherwise false.

Input Format:
First line contains integer n (size of array)
Second line contains n space-separated integers

Output Format:
Print true if array is sorted, otherwise false

Example 1:
Input:
5
10 20 30 40 50

Output:
true

Example 2:
Input:
6
90 80 100 70 40 30

Output:
false

Constraints:
1 <= n <= 10^6
-10^9 <= arr[i] <= 10^9
*/

import java.util.Scanner;

public class CheckIfArrayIsSorted {

    static boolean isSorted(int[] arr) {

        if (arr.length <= 1) {
            return true;
        }

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                return false;   // found decreasing pair
            }
        }

        return true;   // no decreasing pair found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = isSorted(arr);

        System.out.println(result);

        sc.close();
    }
}