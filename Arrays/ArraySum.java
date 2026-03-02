/*
Problem: Sum of Array

Description:
You are given an integer array. Your task is to find and return the sum of all elements in the array.

Input Format:
First line contains an integer n (size of array)
Second line contains n space-separated integers

Output Format:
Print a single integer — the sum of array elements

Example 1:
Input:
4
1 2 3 4

Output:
10

Example 2:
Input:
3
1 3 3

Output:
7

Constraints:
1 <= n <= 10^5
1 <= arr[i] <= 10^4
*/

import java.util.Scanner;

public class ArraySum {

    // Method to calculate sum of array
    static int arraySum(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();

        // Create array
        int arr[] = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call method and print result
        int result = arraySum(arr);
        System.out.println(result);

        sc.close();
    }
}