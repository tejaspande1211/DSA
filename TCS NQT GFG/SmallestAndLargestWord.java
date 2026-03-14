/*
Question:
Given a string containing uppercase and lowercase characters where words are
separated by spaces, find the word with the minimum length and the word with
the maximum length.

Rules:
1. If multiple words have the same minimum length, choose the first occurring word.
2. If multiple words have the same maximum length, choose the last occurring word.

Example 1:
Input:
Hi from Gfg

Output:
Hi from

Example 2:
Input:
water WATER evEry WHere BUT nor a Drop to Drink

Output:
a Drink
*/

import java.util.Scanner;

public class SmallestAndLargestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.trim().split("\\s+");

        String smallest = words[0];
        String largest = words[0];

        for (int i = 1; i < words.length; i++) {

            String word = words[i];

            // first occurring smallest
            if (word.length() < smallest.length()) {
                smallest = word;
            }

            // last occurring largest
            if (word.length() >= largest.length()) {
                largest = word;
            }
        }

        System.out.println(smallest + " " + largest);
    }
}