/*
Question:
Remove character

Given two strings str1 and str2, remove those characters from the first string
(str1) which are present in the second string (str2).

Input:
First line  : string str1
Second line : string str2

Output:
Print the new string after removing characters of str2 from str1.

Example 1:
Input:
computer
cat

Output:
ompuer

Example 2:
Input:
occurrence
car

Output:
ouene
*/

import java.util.*;

public class RemoveCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String result = "";

        for(int i = 0; i < str1.length(); i++) {

            char c = str1.charAt(i);

            boolean remove = false;

            for(int j = 0; j < str2.length(); j++) {

                if(c == str2.charAt(j)) {
                    remove = true;
                    break;
                }
            }

            if(!remove) {
                result += c;
            }
        }

        System.out.println(result);

        sc.close();
    }
    // static String removeChars(String str1, String str2) {
    //     // code here
    //     Set<Character> elements = new HashSet<>();

    //     for (char c : str2.toCharArray()) {
    //         elements.add(c);
    //     }
    
    //     StringBuilder sb = new StringBuilder();
    
    //     for (char c : str1.toCharArray()) {
    //         if (!elements.contains(c)) {
    //             sb.append(c);
    //         }
    //     }
    
    //     return sb.toString();
    // }
}