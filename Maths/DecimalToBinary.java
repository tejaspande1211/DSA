/*
Problem Statement:
------------------
Write a program to convert a given decimal number into its binary equivalent.

Input Format:
-------------
A single integer N.

Output Format:
--------------
The binary representation of the given number.

Example:
--------
Input:
13

Output:
Binary of the given number: 1101
*/

import java.util.*;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to convert: ");
        int n = sc.nextInt();

        // Handle zero case
        if (n == 0) {
            System.out.println("Binary of the given number: 0");
            sc.close();
            return;
        }

        int[] binary = new int[32];  // enough for 32-bit integer
        int i = 0;

        int temp = n;  // preserve original number

        // Store binary digits (remainders)
        while (temp > 0) {
            binary[i] = temp % 2;
            temp = temp / 2;
            i++;
        }

        System.out.print("Binary of the given number: ");

        // Print in reverse order
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }

        sc.close();
    }
}
