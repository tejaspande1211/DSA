/*
Problem Statement:
Given an integer array, find the second smallest distinct element.

Edge Cases:
- If array has less than 2 elements
- If all elements are the same
Then second smallest does not exist.

Input:
First line  : Integer n (size of array)
Second line : n integers (array elements)

Output:
Second smallest element or a message if it does not exist

Example:
Input:
5
4 2 7 2 9

Output:
4
*/

import java.util.Scanner;

public class SecondSmallestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Edge case: less than 2 elements
        if (n < 2) {
            System.out.println("Second smallest element does not exist");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second smallest element does not exist");
        } else {
            System.out.println(secondSmallest);
        }

        sc.close();
    }
}
