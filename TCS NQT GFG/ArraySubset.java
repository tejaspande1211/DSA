/*
Problem: Array Subset

Description:
Given two arrays a[] and b[], determine whether b[] is a subset of a[].

Input Format:
First line contains integer n (size of array a)
Second line contains n space-separated integers
Third line contains integer m (size of array b)
Fourth line contains m space-separated integers

Output Format:
Print true if b is subset of a, otherwise false

Example:
Input:
6
11 7 1 13 21 3
3
11 3 7

Output:
true
*/

import java.util.*;

public class ArraySubset {

    /*
     * --------------------------------------------
     * METHOD 1: Sorting + Two Pointer (Active)
     * Time: O(n log n + m log m)
     * Space: O(1)
     * --------------------------------------------
     */
    static boolean isSubsetSorting(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] == b[j]) {
                i++;
                j++;
            } 
            else if (a[i] < b[j]) {
                i++;
            } 
            else {
                return false; // element in b not found
            }
        }

        return j == b.length;
    }


    /*
     * --------------------------------------------
     * METHOD 2: HashSet Approach (Faster Time)
     * Time: O(n + m)
     * Space: O(n)
     * --------------------------------------------
     */
    /*
    static boolean isSubsetHashSet(int[] a, int[] b) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            if (!set.contains(num)) {
                return false;
            }
        }

        return true;
    }
    */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        boolean result = isSubsetSorting(a, b);

        System.out.println(result);

        sc.close();
    }
}