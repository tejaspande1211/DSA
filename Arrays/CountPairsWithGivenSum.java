/*
Problem Statement:
Given an integer array and a target sum, count the number of
pairs whose sum is equal to the target.

Input:
First line  : Integer n (size of array)
Second line : n integers (array elements)
Third line  : Integer target

Output:
Number of valid pairs

Example:
Input:
5
1 5 7 -1 5
6

Output:
3
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountPairsWithGivenSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        // Map to store frequency of elements
        Map<Integer, Integer> freq = new HashMap<>();

        int count = 0;

        for (int x : arr) {
            int complement = target - x;

            // If complement exists, add its frequency
            if (freq.containsKey(complement)) {
                count += freq.get(complement);
            }

            // Store/update frequency of current element
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        System.out.println(count);
        sc.close();
    }
}
