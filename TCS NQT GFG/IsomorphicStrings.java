/*
Question:
Isomorphic Strings

Given two strings s1 and s2 consisting of only lowercase English letters
and of equal length, check if these two strings are isomorphic.

Two strings are isomorphic if the characters in s1 can be replaced to get s2.

Rules:
1. Each character must map to exactly one character.
2. A character may map to itself.
3. No two characters may map to the same character.

Example 1:
Input:
aab
xxy

Output:
true

Explanation:
a -> x
b -> y
Mapping is consistent.

Example 2:
Input:
aab
xyz

Output:
false

Explanation:
'a' maps to both 'x' and 'y', which is invalid.

Example 3:
Input:
abc
xxz

Output:
false

Explanation:
'a' and 'b' both map to 'x'.
*/

import java.util.*;

public class IsomorphicStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        HashMap<Character, Character> s1ToS2 = new HashMap<>();
        HashMap<Character, Character> s2ToS1 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (s1ToS2.containsKey(c1)) {
                if (s1ToS2.get(c1) != c2) {
                    System.out.println(false);
                    return;
                }
            } else {
                s1ToS2.put(c1, c2);
            }

            if (s2ToS1.containsKey(c2)) {
                if (s2ToS1.get(c2) != c1) {
                    System.out.println(false);
                    return;
                }
            } else {
                s2ToS1.put(c2, c1);
            }
        }

        System.out.println(true);
    }
}