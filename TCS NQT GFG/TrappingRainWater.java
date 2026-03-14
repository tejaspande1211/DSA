/*
Question:
Trapping Rain Water

Given an array arr[] with non-negative integers representing the height of blocks.
The width of each block is 1. Compute how much water can be trapped between the
blocks during the rainy season.

Input:
First line  : integer n (size of array)
Second line : n space separated integers representing heights

Output:
Print the total units of trapped water.

Example:
Input:
6
3 0 1 0 4 0

Output:
10
*/

import java.util.*;

public class TrappingRainWater {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // height input
        }

        int result = maxWater(arr);

        System.out.println(result);

        sc.close();
    }

    public static int maxWater(int arr[]) {

        int left = 0;
        int right = arr.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int trappedWater = 0;

        while (left <= right) {

            if (arr[left] < arr[right]) {

                if (arr[left] > leftMax)
                    leftMax = arr[left];
                else
                    trappedWater += leftMax - arr[left];

                left++;

            } else {

                if (arr[right] > rightMax)
                    rightMax = arr[right];
                else
                    trappedWater += rightMax - arr[right];

                right--;
            }
        }

        return trappedWater;
    }
}