import java.util.Scanner;

/*
Problem Statement:
------------------
Given a string s, remove all spaces from it.

Input:
------
A string s (may contain leading, trailing, or multiple spaces)

Output:
-------
A new string with all spaces removed.

Example 1:
Input:  geeks for geeks
Output: geeksforgeeks

Example 2:
Input:   g f g
Output: gfg
*/

public class RemoveSpaces {

    public static String removeSpaces(String s) {

        StringBuilder result = new StringBuilder();

        // Traverse each character
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {   // Skip space character
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String output = removeSpaces(input);

        System.out.println("String after removing spaces: " + output);

        sc.close();
    }
}
