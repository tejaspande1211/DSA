/*
Question:
First negative integer in every window of size k

Given an array arr[] and a positive integer k, find the first negative
integer for each window (contiguous subarray) of size k.

Note:
If a window does not contain a negative integer, return 0 for that window.

Input:
First line  : integer n (size of array)
Second line : n space separated integers
Third line  : integer k (window size)

Output:
Print the first negative integer for every window of size k.

Example 1:
Input:
5
-8 2 3 -6 10
2

Output:
-8 0 -6 -6

Example 2:
Input:
8
12 -1 -7 8 -15 30 16 28
3

Output:
-1 -1 -7 -15 -15 0
*/

import java.util.*;

public class FirstNegativeInWindow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();     // size of array
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();     // window size

        List<Integer> result = firstNegative(arr, k);

        for(int val : result){
            System.out.print(val + " ");
        }

        sc.close();
    }

    public static List<Integer> firstNegative(int arr[], int k){

        int n = arr.length;

        List<Integer> result = new ArrayList<>();

        // stores indices of negative numbers
        Deque<Integer> dq = new ArrayDeque<>();

        // Build first window
        for(int i = 0; i < k; i++){
            if(arr[i] < 0){
                dq.addLast(i);
            }
        }

        // store answer for first window
        if(dq.isEmpty())
            result.add(0);
        else
            result.add(arr[dq.peekFirst()]);

        // Slide window
        for(int i = k; i < n; i++){

            // remove elements outside window
            while(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.pollFirst();
            }

            // add new element
            if(arr[i] < 0){
                dq.addLast(i);
            }

            // store result
            if(dq.isEmpty())
                result.add(0);
            else
                result.add(arr[dq.peekFirst()]);
        }

        return result;
    }
}