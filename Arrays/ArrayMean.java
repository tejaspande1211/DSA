/*
Problem: Mean of an Array

Description:
Given an unsorted array of integers, find the mean (average) of the array.
Return the floor value of the mean.

Input Format:
First line contains integer n (size of array)
Second line contains n space-separated integers

Output Format:
Print a single integer — the floor value of the mean

Example 1:
Input:
8
1 3 4 2 6 5 8 7

Output:
4

Example 2:
Input:
5
4 4 4 4 4

Output:
4

Constraints:
1 <= n <= 10^6
*/

import java.util.Scanner;

public class ArrayMean {

    // Method to calculate mean of array
    static int findMean(int arr[]) {

        long sum = 0;   // use long to prevent overflow
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return (int)(sum / n);   // integer division → floor value
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read size
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Read elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMean(arr);
        System.out.println(result);

        sc.close();
    }
}