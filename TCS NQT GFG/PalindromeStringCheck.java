/*
Question:
Palindrome String

You are given a string s. Your task is to determine if the string
is a palindrome. A string is considered a palindrome if it reads
the same forwards and backwards.

Input:
Single line containing the string s.

Output:
Print true if the string is a palindrome, otherwise print false.

Example 1:
Input:
abba

Output:
true

Example 2:
Input:
abc

Output:
false
*/

import java.util.*;

public class PalindromeStringCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();   // input string

        boolean result = isPalindrome(s);

        System.out.println(result);

        sc.close();
    }

    public static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}