// ============================================================
// Problem: Project Team Selection (Combination)
// TCS NQT Format
// ============================================================
// Problem Statement:
//   A tech company has n employees and wants to form a team
//   of r people. Since everyone has equal responsibility,
//   order of selection does NOT matter.
//   Find the number of ways to form the team.
//
// ------------------------------------------------------------
// Input Format:
//   First line  : Integer n (total employees)
//   Second line : Integer r (team size)
//
// Output Format:
//   Print the number of ways to select the team.
//   If input is invalid, print: INVALID INPUT
//
// ------------------------------------------------------------
// Example:
//   Input : n = 5, r = 3
//   Output: 10
//   Explanation:
//     Employees: A, B, C, D, E
//     {A,B,C} and {C,B,A} are the SAME team → order doesn't matter
//     C(5,3) = 5! / (3! × 2!) = 120 / (6 × 2) = 10
//
// ------------------------------------------------------------
// Key Concept — Permutation vs Combination:
//   Permutation → order matters   → P(n,r) = n! / (n-r)!
//   Combination → order doesn't   → C(n,r) = P(n,r) / r!
//                                           = n! / (r! × (n-r)!)
//
// Why divide by r! ?
//   Every 1 combination is counted r! times in permutation.
//   Example: {A,B,C} has 3! = 6 arrangements → same team.
//   So C(n,r) = P(n,r) / r!
//
// ------------------------------------------------------------
// Efficient Approach — avoid computing full factorials:
//   C(n,r) = [n × (n-1) × ... × (n-r+1)] / r!
//              ↑ numerator = P(n,r) using loop
//              ↑ denominator = r!
//
//   Using long to handle large intermediate values.
//
// Validity:
//   - n and r must be non-negative
//   - r must be <= n
// ============================================================

public class TeamSelection {

    // --------------------------------------------------------
    // Helper: compute factorial of a number
    // --------------------------------------------------------
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // --------------------------------------------------------
    // Core logic — TCS NQT judge calls this method
    // Computes C(n, r) = n! / (r! * (n-r)!)
    //
    // Optimised as:
    //   numerator   = n * (n-1) * ... * (n-r+1)   [r terms]
    //   denominator = r!
    // --------------------------------------------------------
    public static long nCr(int n, int r) {

        // Validity check
        if (n < 0 || r < 0 || r > n) {
            return -1;   // signals invalid input
        }

        // Edge cases
        if (r == 0 || r == n) return 1;   // C(n,0) = C(n,n) = 1

        // Optimisation: C(n,r) == C(n, n-r)
        // Use smaller r to reduce number of multiplications
        if (r > n - r) {
            r = n - r;
        }

        // Numerator: n * (n-1) * ... * (n-r+1)  →  r terms
        long numerator = 1;
        for (int i = 0; i < r; i++) {
            numerator *= (n - i);
        }

        // Denominator: r!
        long denominator = factorial(r);

        return numerator / denominator;
    }

    // --------------------------------------------------------
    // Main — for local testing (TCS NQT uses its own driver)
    // --------------------------------------------------------
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        long answer = nCr(n, r);

        if (answer == -1) {
            System.out.println("INVALID INPUT");
        } else {
            System.out.println(answer);
        }

        sc.close();
    }
}