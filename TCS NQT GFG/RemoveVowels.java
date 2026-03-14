/*
Question:
Remove vowels from string

Given a string s, remove all vowels from the string and print
the remaining characters in the same order.

Input:
Single line containing a string.

Output:
String after removing vowels.

Example 1:
Input:
welcome to geeksforgeeks

Output:
wlcm t gksfrgks

Example 2:
Input:
what is your name ?

Output:
wht s yr nm ?
*/

import java.util.*;

public class RemoveVowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String result = "";

        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);

            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' &&
               c!='A' && c!='E' && c!='I' && c!='O' && c!='U'){
                result += c;
            }
        }

        System.out.println(result);

        sc.close();

        // String removeVowels(String s) {
        // // code here
        // Set<Character> vowel = Set.of('a','e','u','i','o','A','E','I','O','U');
        // StringBuilder sb = new StringBuilder();
        // for (char c : s.toCharArray()) {
        //     if (!vowel.contains(c)) {
        //         sb.append(c);
        //     }
        // }
    
        // return sb.toString();
    }
}