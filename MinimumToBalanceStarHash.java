import java.util.Scanner;

/*
 * Problem Statement:
 * Given a string S consisting of '*' and '#', the length of the string is variable.
 * Find the minimum number of '*' or '#' to add to make it a valid string.
 * A string is valid if the count of '*' and '#' are equal.
 *
 * Output rules:
 * - If '*' > '#' : print positive integer (number of '#' to add)
 * - If '#' > '*' : print negative integer (number of '*' to add)
 * - If '#' == '*': print 0
 *
 * Sample test case:
 * Input:  "****##"
 * Output: 2  (need 2 more '#')
 *
 * Input: "###***"
 * Output: 0
 */
public class MinimumToBalanceStarHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int stars = 0, hashes = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') stars++;
            else if (str.charAt(i) == '#') hashes++;
        }
        System.out.println(stars - hashes);
    }
}