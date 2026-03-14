import java.util.Scanner;

/*
 * Problem Statement:
 * Jack works in a bakery and can take leftover pastries home.
 * He must pack N pastries into packets of equal size.
 * Find the packet size that maximizes the leftover pastries.
 * If multiple packet sizes give the same leftover, choose the largest.
 *
 * Input:  A single integer N (total number of pastries)
 * Output: A single integer (the best packet size)
 *
 * Example 1:
 * Input:  5
 * Output: 3
 * Explanation:
 *   Packet size 1 → 5%1 = 0 leftover
 *   Packet size 2 → 5%2 = 1 leftover
 *   Packet size 3 → 5%3 = 2 leftover ← MAX
 *   Packet size 4 → 5%4 = 1 leftover
 *   Packet size 5 → 5%5 = 0 leftover
 *
 * Example 2:
 * Input:  12
 * Output: 7
 * Explanation:
 *   Packet size 7 → 12%7 = 5 leftover ← MAX
 *
 * Constraints:
 *   0 < N < 1000
 *   Only integer values allowed
 */
public class MaxLeftoverPastries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxLeftover = 0;
        int bestPacketSize = 1;

        for (int packetSize = 1; packetSize <= n; packetSize++) {
            int leftover = n % packetSize;

            if (leftover > maxLeftover) {
                // found a better leftover, update both
                maxLeftover = leftover;
                bestPacketSize = packetSize;
            } else if (leftover == maxLeftover) {
                // same leftover, pick larger packet size
                bestPacketSize = packetSize;
            }
        }

        System.out.println(bestPacketSize);
    }
}