/*
Problem: Largest in Array

Description:
Given an array of integers, find and return the largest element.

Input Format:
First line contains integer n (size of array)
Second line contains n space-separated integers

Output Format:
Print a single integer — the largest element

Example 1:
Input:
5
1 8 7 56 90
Output:
90

Example 2:
Input:
4
5 5 5 5
Output:
5

Example 3:
Input:
1
10
Output:
10

Constraints:
1 <= n <= 10^6
*/

import java.util.Scanner;

public class LargestInArray {

    static int largest(int arr[]) {

        int largest = arr[0];   // correct initialization

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = largest(arr);
        System.out.println(result);

        sc.close();
    }
}