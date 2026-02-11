/*
Problem Statement:
Given an unsorted array of integers and a number k,
count the number of contiguous subarrays whose sum equals k.

Input:
First line  : Integer n (size of array)
Second line : n integers (array elements)
Third line  : Integer k (target sum)

Output:
Number of subarrays with sum equal to k

Example:
Input:
5
10 2 -2 -20 10
-10

Output:
3
*/

import java.util.HashMap;
import java.util.Scanner;

public class SubarraysWithGivenSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        // Map to store prefix sum frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Important: prefix sum 0 occurs once
        map.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : arr) {
            currentSum += num;

            // Check if (currentSum - k) exists
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }

            // Store/update current prefix sum frequency
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        System.out.println(count);
        sc.close();
    }
}
