/*
Question:
Frequencies in a Limited Array

You are given an array arr[] containing positive integers.
The elements in the array range from 1 to n (where n is the size of the array),
and some numbers may be repeated or absent.

Your task is to count the frequency of all numbers in the range 1 to n
and return an array of size n such that result[i] represents
the frequency of number (i+1).

Input:
arr = [2, 3, 2, 3, 5]

Output:
[0, 2, 2, 0, 1]

Explanation:
1 occurs 0 times
2 occurs 2 times
3 occurs 2 times
4 occurs 0 times
5 occurs 1 time
*/

import java.util.*;

public class FrequencyInLimitedArraySolution {

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        List<Integer> result = frequencyCount(arr);
        System.out.println(result);
    }

    public static List<Integer> frequencyCount(int[] arr) {

        int n = arr.length;

        // Step 1: Create frequency array of size n
        int[] freq = new int[n];

        // Step 2: Count occurrences
        for (int num : arr) {
            if (num >= 1 && num <= n) {
                freq[num - 1]++;
            }
        }

        // Step 3: Convert to List<Integer>
        List<Integer> result = new ArrayList<>();
        for (int count : freq) {
            result.add(count);
        }

        return result;
    }
}