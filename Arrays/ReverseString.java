import java.util.Scanner;

/*
Problem Statement:
------------------
Write a function that reverses a string.
The input string is given as an array of characters.

You must do this by modifying the input array in-place
with O(1) extra memory.

Input:
------
A string (will be converted into a character array)

Output:
-------
The reversed character array (printed as a string)

Example 1:
Input:  hello
Output: olleh

Example 2:
Input:  hannah
Output: hannah
*/

public class ReverseString {

    // Function to reverse character array in-place
    public static void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        // Two-pointer approach
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Convert string to char array
        char[] arr = input.toCharArray();

        // Reverse in-place
        reverseString(arr);

        // Print result
        System.out.println("Reversed String: " + new String(arr));

        sc.close();
    }
}
