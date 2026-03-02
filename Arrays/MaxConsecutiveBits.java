/*
Problem: Max Consecutive Bits

Description:
Given an array consisting only of 0's and 1's,
return the count of the maximum number of consecutive
0's or 1's present in the array.

Input Format:
First line contains integer n
Second line contains n space-separated integers (0 or 1)

Output Format:
Print maximum consecutive count

Example 1:
Input:
7
0 1 0 1 1 1 1
Output:
4

Example 2:
Input:
6
0 0 1 0 1 0
Output:
2
*/

import java.util.Scanner;

public class MaxConsecutiveBits {

    static int maxConsecBits(int[] arr) {

        if (arr.length == 0)
            return 0;

        int max = 1;
        int curr = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                curr++;
            } else {
                curr = 1;   // reset but count current element
            }

            max = Math.max(max, curr);
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxConsecBits(arr);
        System.out.println(result);

        sc.close();
    }
}