import java.util.Scanner;

/*
 * Problem Statement:
 * Given a string S, check whether it is a palindrome or not.
 * A string is a palindrome if it reads the same forwards and backwards.
 * Print "Palindrome" if true, else print "Not a Palindrome".
 *
 * Sample test case:
 * Input:  "madam"
 * Output: Palindrome
 *
 * Input:  "hello"
 * Output: Not a Palindrome
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(rev) ? "Palindrome" : "Not a Palindrome");
    }
}