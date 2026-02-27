import java.util.Scanner;

/*
 * Problem Statement:
 * Given a number N, check whether it is an Armstrong number or not.
 * A number is Armstrong if the sum of its digits each raised to the
 * power of number of digits equals the number itself.
 * Example: 153 = 1^3 + 5^3 + 3^3 = 153
 *
 * Sample test case:
 * Input:  153
 * Output: Armstrong Number
 *
 * Input:  100
 * Output: Not an Armstrong Number
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits = String.valueOf(n).length();
        int sum = 0, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += (int) Math.pow(d, digits);
            temp /= 10;
        }
        System.out.println(sum == n ? "Armstrong Number" : "Not an Armstrong Number");
    }
}