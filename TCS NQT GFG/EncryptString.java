/*
Question:
Encrypt the string.

Bingu decided to encrypt all the strings he had by the following method.
Every substring of identical letters is replaced by a single instance of that
letter followed by the number of occurrences of that letter.
Then the obtained string is reversed.

Example 1:
Input:
aabc

Output:
1c1b2a

Explanation:
Step 1: aabc -> a2b1c1
Step 2: reverse -> 1c1b2a

Example 2:
Input:
aaaaa

Output:
5a
*/
import java.util.Scanner;

public class EncryptString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder encode = new StringBuilder();
        int count = 1;

        for(int i = 0; i < s.length(); i++) {

            if(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } 
            else {
                encode.append(s.charAt(i));
                encode.append(count);
                count = 1;
            }
        }

        encode.reverse();
        System.out.println(encode.toString());
    }
}
