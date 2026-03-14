/*
Problem: Equal Sum (Equilibrium Point)

Description:
Given an array, determine if there exists an index such that
the sum of elements on its left is equal to the sum of elements
on its right.

If no such index exists, return false.

Input Format:
First line contains integer n
Second line contains n space-separated integers

Output Format:
Print true if such index exists, otherwise false

Example 1:
Input:
4
1 2 3 3

Output:
true

Example 2:
Input:
2
1 5

Output:
false
*/

import java.util.ArrayList;
import java.util.Scanner;

public class EqualSumEquilibrium {

    static boolean equilibrium(int arr[]) {

        int n = arr.length;

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return true;
            }

            leftSum += arr[i];
        }

        return false;
    }

    // String equilibrium(int arr[]) {
    //     // code here
    //     ArrayList<Integer> left = new ArrayList<>();
    //     int sum = 0;
    //     int n = arr.length;
    //     for (int i = 0; i < n; i++) {
    //         sum += arr[i];
    //         left.add(sum);
    //     }

    //     ArrayList<Integer> right = new ArrayList<>();
    //     sum = 0;
    //     for (int i = n - 1; i >= 0; i--) {
    //         sum += arr[i];
    //         right.add(0, sum); // insert at front
    //     }
    //     for (int i = 0; i < n; i++) {
    //         int leftSum  = (i == 0)     ? 0 : left.get(i - 1);
    //         int rightSum = (i == n - 1) ? 0 : right.get(i + 1);

    //         if (leftSum == rightSum) {
    //             return "true";
    //         }
    //     }

    //     return "false";
    // }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = equilibrium(arr);

        System.out.println(result);

        sc.close();
    }
}