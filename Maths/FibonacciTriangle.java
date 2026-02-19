/*
Problem Statement:
------------------
Write a program to generate a Fibonacci Triangle.

In a Fibonacci Triangle:
- Each row starts with 0 and 1.
- Each next number is the sum of the previous two numbers.
- The number of rows is given by the user.

Input Format:
-------------
A single integer N (number of rows).

Output Format:
--------------
Fibonacci Triangle pattern.

Example:
--------
Input:
4

Output:
1
1   2
1   2   3
1   2   3   5
*/

import java.util.*;

public class FibonacciTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int a = 0;
            int b = 1;

            System.out.print(b + "\t");

            for (int j = 1; j < i; j++) {

                int c = a + b;
                System.out.print(c + "\t");

                a = b;
                b = c;
            }

            System.out.println();
        }

        sc.close();
    }
}
