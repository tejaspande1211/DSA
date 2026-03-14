/*
Question:
Given a string, count the number of alphabets present in the string.
Alphabets include both uppercase (A-Z) and lowercase (a-z).

Example 1
Input:
adjfjh23

Output:
6

Explanation:
Characters '2' and '3' are not alphabets.

Example 2
Input:
n0jj#k$

Output:
4

Explanation:
Characters '0', '#', '$' are not alphabets.
*/

import java.util.Scanner;

public class CountAlphabets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int count = 0;

        // Traverse each character
        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Check if character is alphabet
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                count++;
            }
        }

        // Print result
        System.out.println("Number of alphabets: " + count);
    }


    //     class Solution {
    //     static int Count(String S) {
    //         int count = 0;
    //         for(int i = 0; i < S.length(); i++){
    //             if(Character.isLetter(S.charAt(i))){
    //                 count++;
    //             }
    //         }
    //         return count;
    //     }
    // }
}
