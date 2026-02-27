import java.util.Scanner;

/*
 * Problem Statement:
 * Given an integer N, reverse its digits and print the result.
 * If the reversed number has leading zeros, ignore them.
 *
 * Sample test case:
 * Input:  12345
 * Output: 54321
 *
 * Input:  1000
 * Output: 1
 */
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println(rev);
    }
}