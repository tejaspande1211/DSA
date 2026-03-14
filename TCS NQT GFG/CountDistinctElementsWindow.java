/*
Question:
Count distinct elements in every window

Given an integer array arr[] and a number k.
Find the count of distinct elements in every window of size k in the array.

Input:
First line  : integer n (size of array)
Second line : n space separated integers
Third line  : integer k (window size)

Output:
Print the number of distinct elements in every window of size k.

Example 1:
Input:
7
1 2 1 3 4 2 3
4

Output:
3 4 4 3

Example 2:
Input:
3
4 1 1
2

Output:
2 1
*/

import java.util.*;

public class CountDistinctElementsWindow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // size of array
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();     // array input
        }

        int k = sc.nextInt();          // window size

        ArrayList<Integer> result = countDistinct(arr, k);

        for(int val : result){
            System.out.print(val + " ");
        }

        sc.close();
    }

    public static ArrayList<Integer> countDistinct(int arr[], int k){

        ArrayList<Integer> result = new ArrayList<>();

        // stores frequency of elements in current window
        HashMap<Integer, Integer> map = new HashMap<>();

        // process first window
        for(int i = 0; i < k; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        result.add(map.size());

        // slide the window
        for(int i = k; i < arr.length; i++){

            // add new element
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // remove leftmost element
            int leftElement = arr[i - k];
            map.put(leftElement, map.get(leftElement) - 1);

            if(map.get(leftElement) == 0){
                map.remove(leftElement);
            }

            result.add(map.size());
        }

        return result;
    }
}