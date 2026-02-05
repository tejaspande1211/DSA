// Problem Statement
// Given an array of integers, write a program to display all the odd numbers present in the array in the same order as they appear.
// Read input from STDIN
// Print output to STDOUT
// Do not print any extra text, labels, or messages

// Input Format
// The first line contains an integer N, the size of the array.
// The second line contains N space-separated integers.

// Output Format
// Print a single line containing all the odd numbers from the array, separated by a space.
// Maintain the original order.

// Sample Input
// 6
// 2 4 5 7 8 9

// Sample Output
// 5 7 9

import java.util.Scanner;
public class Oddno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(num%2 !=0){
                System.out.print(num+" ");
            }
        }
    }
    
}
