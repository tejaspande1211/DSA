import java.util.Scanner;

/*
Problem Statement:
------------------
Given a string s, return the string after replacing every uppercase
letter with the same lowercase letter.

Input:
------
A string s containing uppercase and/or lowercase letters.

Output:
-------
A new string where all uppercase letters are converted to lowercase.

Example 1:
Input:  Hello
Output: hello

Example 2:
Input:  here
Output: here

Example 3:
Input:  LOVELY
Output: lovely
*/

public class ToLowerCaseProgram {

    // Approach 1: Using built-in method
    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String output = toLowerCase(input);

        System.out.println("Lowercase String: " + output);

        sc.close();
    }
}
