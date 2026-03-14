import java.util.Scanner;

/*
 * Problem Statement:
 * An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW).
 * A company manager wants to make the production of both types of vehicle according to:
 * 1st data: Total number of vehicles (two-wheeler + four-wheeler) = V
 * 2nd data: Total number of wheels = W
 * Find how many two-wheelers and four-wheelers need to be manufactured.
 *
 * Constraints:
 * - 2 <= W
 * - W % 2 == 0
 * - V < W
 * Print "INVALID INPUT" if constraints are not met.
 *
 * Sample test case:
 * Input:  V = 200, W = 540
 * Output: TW = 130, FW = 70
 * Explanation: 130 + 70 = 200 vehicles, (70*4) + (130*2) = 540 wheels
 */
public class TwoWheelerFourWheeler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();

        if (w < 2 || w % 2 != 0 || v >= w) {
            System.out.println("INVALID INPUT");
            return;
        }

        int tw = (4 * v - w) / 2;
        int fw = (w - 2 * v) / 2;
        System.out.println("TW = " + tw + " FW = " + fw);
    }
}