/*
File Name: ValidAnagramChecker.java

Problem Statement:
Given two strings s and t, determine whether t is an anagram of s.
Return true if t is an anagram of s, and false otherwise.

An anagram is formed by rearranging the letters of another string
using all original characters exactly once.

Input Format:
- First line: String s
- Second line: String t

Output Format:
- Print true if t is an anagram of s
- Print false otherwise

Example 1:
Input:
anagram
nagaram

Output:
true

Example 2:
Input:
rat
car

Output:
false
*/

import java.util.Scanner;

public class ValidAnagramChecker {

    public static boolean isAnagram(String s, String t) {

        // Step 1: If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create frequency array for 26 lowercase letters
        int[] count = new int[26];

        // Step 3: Traverse both strings together
        for (int i = 0; i < s.length(); i++) {

            // Increase count for character in s
            count[s.charAt(i) - 'a']++;

            // Decrease count for character in t
            count[t.charAt(i) - 'a']--;
        }

        // Step 4: Check if all counts are zero
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        // If all frequencies matched
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        String s = sc.nextLine();
        String t = sc.nextLine();

        // Calling function
        boolean result = isAnagram(s, t);

        // Printing output
        System.out.println(result);

        sc.close();
    }
}
