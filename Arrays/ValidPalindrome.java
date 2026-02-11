import java.util.Scanner;

/*
Problem Statement:
------------------
A phrase is a palindrome if, after converting all uppercase letters to lowercase
and removing all non-alphanumeric characters, it reads the same forward and backward.

Given a string s, return true if it is a palindrome, or false otherwise.

Input:
------
A string s (may contain letters, digits, spaces, and special characters)

Output:
-------
true  -> if the cleaned string is a palindrome
false -> otherwise

Example 1:
Input:  A man, a plan, a canal: Panama
Output: true

Example 2:
Input:  race a car
Output: false
*/

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        StringBuilder cleaned = new StringBuilder();

        // Step 1: Remove non-alphanumeric characters and convert to lowercase
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Step 2: Store cleaned string
        String forward = cleaned.toString();

        // Step 3: Reverse cleaned string
        String reversed = cleaned.reverse().toString();

        // Step 4: Compare both
        return forward.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();   // nextLine() is important for spaces

        boolean result = isPalindrome(input);

        System.out.println("Is Palindrome: " + result);

        sc.close();
    }
}
