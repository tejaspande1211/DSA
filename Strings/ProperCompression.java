// /*
// Problem Statement:
// ------------------
// Given a string S where each character is followed by its frequency 
// (as a single digit integer), decompress the string.

// Each character should be repeated according to its frequency.

// Input Format:
// -------------
// A single string S.

// Output Format:
// --------------
// The decompressed string.

// Example:
// --------
// Input:
// a3b5c2a2

// Output:
// aaabbbbbccaa
// */

import java.util.*;

public class ProperCompression {

    public static String properCompression(String s) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {

            if (i + 1 >= s.length()) {
                break; // safety check
            }

            char ch = s.charAt(i);
            int count = s.charAt(i + 1) - '0'; // faster than getNumericValue

            while (count > 0) {
                result.append(ch);
                count--;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(properCompression(input));
        sc.close();
    }
}
