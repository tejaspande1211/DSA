/*
Problem Statement:
Given a string S (without white spaces), write a program to count:
1. Number of Uppercase characters
2. Number of Lowercase characters
3. Number of Numeric characters
4. Number of Special characters

Input:
A single string S.

Output:
Four integers printed on separate lines:
1. Count of uppercase characters
2. Count of lowercase characters
3. Count of numeric characters
4. Count of special characters

Example:
Input:
#GeeKs01fOr@gEEks07

Output:                                        
5
8   
4
2
*/

import java.util.Scanner;

public class CharacterTypeCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Reading input string
        String s = sc.nextLine();

        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;

        // Traversing each character of the string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            } 
            else if (Character.isLowerCase(ch)) {
                lower++;
            } 
            else if (Character.isDigit(ch)) {
                digit++;
            } 
            else {
                special++;
            }
        }

        // Printing results
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(digit);
        System.out.println(special);

        sc.close();
    }
}
