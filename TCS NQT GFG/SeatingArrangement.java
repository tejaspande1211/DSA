// ============================================================
// Problem: Number of Ways n People Can Occupy r Seats
// TCS NQT Format
// ============================================================
// Problem Statement:
//   Given n people and r distinct seats, find the number of
//   ways to seat r people out of n in those r seats.
//   Since seats are distinct and order matters → Permutation.
//
// ------------------------------------------------------------
// Input Format:
//   First line  : Integer n (total people)
//   Second line : Integer r (number of seats)
//
// Output Format:
//   Print the total number of possible seating arrangements.
//
// ------------------------------------------------------------
// Example:
//   Input : n = 5, r = 2
//   Output: 20
//   Explanation:
//     P(5,2) = 5! / (5-2)! = 5! / 3! = 5 × 4 = 20
//
// ------------------------------------------------------------
// Formula:
//   P(n, r) = n! / (n - r)!
//           = n × (n-1) × (n-2) × ... × (n-r+1)   [r terms]
//
//   Direct multiplication avoids computing full factorials
//   and prevents overflow for large values.
//
// Validity:
//   - r must be <= n  (can't seat more people than available)
//   - r and n must be non-negative
// ============================================================

public class SeatingArrangement {

    // --------------------------------------------------------
    // Core logic — TCS NQT judge calls this method
    // Computes P(n, r) = n * (n-1) * ... * (n-r+1)
    // Using long to handle large results
    // --------------------------------------------------------
    public static long nPr(int n, int r) {

        // Validity check
        if (r < 0 || n < 0 || r > n) {
            return -1;   // signals invalid input
        }

        // r = 0 edge case: only 1 way (empty arrangement)
        if (r == 0) return 1;

        long result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);   // n * (n-1) * ... * (n-r+1)
        }

        return result;
    }

    // --------------------------------------------------------
    // Main — for local testing (TCS NQT uses its own driver)
    // --------------------------------------------------------
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        long answer = nPr(n, r);

        if (answer == -1) {
            System.out.println("INVALID INPUT");
        } else {
            System.out.println(answer);
        }

        sc.close();
    }
}
