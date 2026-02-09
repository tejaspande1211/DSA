import java.util.*;

/*
====================================================
Problem: Find Minimum and Maximum in an Array
====================================================

Given an integer array, find the minimum and maximum
elements present in the array.

----------------------------------------------------
Input Format:
----------------------------------------------------
- First line: integer n (size of array)
- Second line: n space-separated integers

----------------------------------------------------
Output Format:
----------------------------------------------------
- Print minimum element
- Print maximum element

----------------------------------------------------
Example:
----------------------------------------------------
Input:
6
1 4 3 5 8 6

Output:
Min = 1
Max = 8
====================================================
*/

class MinMaxFinder {

    // Method to compute min and max
    public static ArrayList<Integer> getMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        // Single traversal of array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];

            if (arr[i] > max)
                max = arr[i];
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = getMinMax(arr);

        // Output
        System.out.println("Min = " + ans.get(0));
        System.out.println("Max = " + ans.get(1));

        sc.close();
    }
}
