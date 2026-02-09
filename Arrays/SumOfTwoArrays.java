/*
 Problem Name: Sum Of Two Arrays

 Problem Statement:
 You are given two numbers 'A' and 'B' in the form of two arrays (A[] and B[]) 
 of lengths 'N' and 'M' respectively, where each array element represents a digit.
 You need to find the sum of these two numbers and return the sum in the form of an array.

 Notes:
 1. The length of each array is greater than zero.
 2. The first index of each array is the most significant digit.
 3. There are no leading zeros in input arrays and output should also not contain leading zeros.

 --------------------------------------------------
 Sample Input 1:
 2
 4 1
 1 2 3 4
 6
 3 2
 1 2 3
 9 9

 Sample Output 1:
 1 2 4 0
 2 2 2

 Explanation:
 Test case 1:
 1234 + 6 = 1240

 Test case 2:
 123 + 99 = 222

 --------------------------------------------------
 Sample Input 2:
 2
 3 3
 4 5 1
 3 4 5
 2 2
 1 1
 1 2

 Sample Output 2:
 7 9 6
 2 3
 --------------------------------------------------
*/

import java.util.*;

public class SumOfTwoArrays {

    public static int[] findArraySum(int[] a, int n, int[] b, int m) {

        int i = n - 1;
        int j = m - 1;
        int carry = 0;

        ArrayList<Integer> result = new ArrayList<>();

        // Add digits from right to left
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a[i];
                i--;
            }

            if (j >= 0) {
                sum += b[j];
                j--;
            }

            result.add(sum % 10);
            carry = sum / 10;
        }

        // Reverse to correct order
        Collections.reverse(result);

        // Convert ArrayList to int[]
        int[] finalResult = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            finalResult[k] = result.get(k);
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            int[] result = findArraySum(a, n, b, m);

            for (int i = 0; i < result.length; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(result[i]);
            }
            System.out.println();
        }

        sc.close();
    }
}
