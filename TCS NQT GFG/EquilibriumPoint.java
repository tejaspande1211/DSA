// ============================================================
// Problem: Equilibrium Point in an Array
// TCS NQT Format
// ============================================================
// Problem Statement:
//   Find the first 0-based index where the sum of elements
//   to the left equals the sum of elements to the right.
//   The element at the index itself is excluded from both sums.
//
// Input Format:
//   - First line  : integer N (size of array)
//   - Second line : N space-separated integers
//
// Output Format:
//   - Print the 0-based equilibrium index, or -1 if not found.
//
// Example:
//   Input : 5
//            1 3 5 2 2
//   Output: 2
//   (Left sum = 1+3 = 4, Right sum = 2+2 = 4)
//
// Approach — Prefix Sum  →  O(N) time, O(1) space
//   1. Compute totalSum of array.
//   2. At each index i:
//        rightSum = totalSum - leftSum - arr[i]
//        if leftSum == rightSum → return i
//   3. Update leftSum += arr[i]
// ============================================================

public class EquilibriumPoint {

    // --------------------------------------------------------
    // Core logic — TCS NQT judge calls this method directly
    // Method signature must match exactly as given in the problem
    // --------------------------------------------------------
    public static int findEquilibrium(int[] arr, int n) {
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        long leftSum = 0;
        for (int i = 0; i < n; i++) {
            long rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i;          // first equilibrium index found
            }

            leftSum += arr[i];
        }

        return -1;                 // no equilibrium point exists
    }

    // --------------------------------------------------------
    // Main — for local testing (TCS NQT handles I/O internally)
    // --------------------------------------------------------
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findEquilibrium(arr, n));

        sc.close();
    }
}