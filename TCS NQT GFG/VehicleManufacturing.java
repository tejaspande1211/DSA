// ============================================================
// Problem: Vehicle Manufacturing Calculation
// TCS NQT Format
// ============================================================
// Problem Statement:
//   An automobile company manufactures two-wheelers (TW) and
//   four-wheelers (FW). Given:
//     V → Total number of vehicles (TW + FW)
//     W → Total number of wheels
//   Calculate the number of two-wheelers and four-wheelers.
//   If values don't produce valid non-negative integers → INVALID INPUT
//
// ------------------------------------------------------------
// Input Format:
//   First line  : Integer V (total vehicles)
//   Second line : Integer W (total wheels)
//
// Output Format:
//   Number of Two Wheelers : <value>
//   Number of Four Wheelers : <value>
//   OR
//   INVALID INPUT
//
// ------------------------------------------------------------
// Example 1:
//   Input : V = 10, W = 26
//   FW = (26 - 20) / 2 = 3
//   TW = 10 - 3 = 7
//   Output:
//     Number of Two Wheelers  : 7
//     Number of Four Wheelers : 3
//
// Example 2:
//   Input : V = 5, W = 11   (W is odd)
//   Output: INVALID INPUT
//
// ------------------------------------------------------------
// Mathematical Approach:
//   TW + FW = V          ...(1)
//   2*TW + 4*FW = W      ...(2)
//
//   From (1): TW = V - FW
//   Substitute in (2):
//       2(V - FW) + 4*FW = W
//       2V + 2*FW = W
//       FW = (W - 2V) / 2
//       TW = V - FW
//
// Validity Conditions (INVALID if any fails):
//   1. W is odd           → FW won't be an integer
//   2. W < 2V or W > 4V   → out of feasible range
//   3. FW < 0 or TW < 0   → negative vehicles
//
// Constraints:
//   1 ≤ V ≤ 1000
//   1 ≤ W ≤ 4000
// ============================================================

public class VehicleManufacturing {

    // --------------------------------------------------------
    // Core logic — TCS NQT judge calls this method
    // --------------------------------------------------------
    public static void calculateVehicles(int v, int w) {

        // Condition 1: W must be even
        // Condition 2: W must be in range [2V, 4V]
        if (w % 2 != 0 || w < 2 * v || w > 4 * v) {
            System.out.println("INVALID INPUT");
            return;
        }

        int fw = (w - 2 * v) / 2;   // number of four-wheelers
        int tw = v - fw;             // number of two-wheelers

        // Condition 3: both must be non-negative (already guaranteed
        // by range check, but kept for safety)
        if (fw < 0 || tw < 0) {
            System.out.println("INVALID INPUT");
            return;
        }

        System.out.println("Number of Two Wheelers : " + tw);
        System.out.println("Number of Four Wheelers : " + fw);
    }

    // --------------------------------------------------------
    // Main — for local testing (TCS NQT uses its own driver)
    // --------------------------------------------------------
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int v = sc.nextInt();
        int w = sc.nextInt();

        calculateVehicles(v, w);

        sc.close();
    }
}