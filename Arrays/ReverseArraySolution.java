/*
Problem Statement:
You are given an array of integers. Your task is to reverse the array in place,
which means you must modify the original array without using extra space.

Input:
- First line contains an integer n, the number of elements.
- Second line contains n space-separated integers.

Output:
- Print the reversed array.

Example:
Input:
5
1 2 3 4 5

Output:
5 4 3 2 1
*/

import java.util.Scanner;

public class ReverseArraySolution {

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
