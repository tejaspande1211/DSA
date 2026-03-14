/*
Question:
Given a string consisting of lowercase English letters,
return the first non-repeating character in the string.
If no such character exists, return '$'.

Example 1
Input:
geeksforgeeks

Output:
f

Example 2
Input:
racecar

Output:
e

Example 3
Input:
aabbccc

Output:
$
*/

import java.util.*;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        // Step 1: Store frequency of characters
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // increase frequency
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find first character with frequency = 1
        char result = '$';

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(map.get(ch) == 1) {
                result = ch;
                break;
            }
        }

        // Output
        System.out.println("First non repeating character: " + result);
    }
}
