/*
Question:
Anagram

Given two non-empty strings s1 and s2 consisting of lowercase English letters,
determine whether they are anagrams of each other.

Two strings are considered anagrams if they contain the same characters
with exactly the same frequencies, regardless of their order.

Input:
First line  : string s1
Second line : string s2

Output:
Print true if the strings are anagrams, otherwise print false.

Example 1:
Input:
geeks
kseeg

Output:
true

Example 2:
Input:
allergy
allergyy

Output:
false
*/

import java.util.*;

public class AnagramTCSStyle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if(s1.length() != s2.length()){
            System.out.println(false);
            return;
        }

        int[] freq = new int[26];

        // count characters from s1
        for(int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
        }

        // subtract characters from s2
        for(int i = 0; i < s2.length(); i++){
            freq[s2.charAt(i) - 'a']--;
        }

        boolean isAnagram = true;

        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                isAnagram = false;
                break;
            }
        }

        System.out.println(isAnagram);

        sc.close();
    }
}