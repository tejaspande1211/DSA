/*
Problem: Addition of Two Square Matrices

Description:
Given two square matrices A and B of size n x n,
compute their sum and store the result in matrix A.

Input Format:
First line contains integer n
Next n lines contain n space-separated integers (Matrix A)
Next n lines contain n space-separated integers (Matrix B)

Output Format:
Print the resulting matrix after addition

Example:
Input:
2
1 2
3 4
4 3
2 1

Output:
5 5
5 5
*/

import java.util.Scanner;

public class MatrixAddition {

    static void addMatrices(int[][] matrixA, int[][] matrixB) {

        int n = matrixA.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] += matrixB[i][j];
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrixA = new int[n][n];
        int[][] matrixB = new int[n][n];

        // Input Matrix A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        // Input Matrix B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        addMatrices(matrixA, matrixB);

        // Print Result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}