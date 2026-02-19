/*
File Name: FirstUniqueCharacter.java

Problem Statement:
Given a string s, find the first non-repeating character in it
and return its index. If it does not exist, return -1.

Input Format:
- A single line containing string s

Output Format:
- Print the index of the first unique character
- If no unique character exists, print -1

Example 1:
Input:
leetcode

Output:
0

Example 2:
Input:
loveleetcode

Output:
2

Example 3:
Input:
aabb

Output:
-1
*/

import java.util.Scanner;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {

        // Frequency array for lowercase letters
        int[] count = new int[26];

        // First pass: count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Second pass: find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // If no unique character found
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        String s = sc.nextLine();

        // Calling function
        int result = firstUniqChar(s);

        // Printing output
        System.out.println(result);

        sc.close();
    }
}
