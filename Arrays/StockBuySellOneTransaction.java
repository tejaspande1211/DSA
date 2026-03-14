/*
Problem: Stock Buy and Sell – Max One Transaction

Description:
Given an array prices[] representing stock prices on different days,
find the maximum profit possible by performing at most one transaction
(buy once and sell once).

If no profit is possible, return 0.

Input Format:
First line contains integer n
Second line contains n space-separated integers

Output Format:
Print maximum profit

Example 1:
Input:
6
7 10 1 3 6 9
Output:
8

Example 2:
Input:
5
7 6 4 3 1
Output:
0
*/

import java.util.Scanner;

public class StockBuySellOneTransaction {

    static int maxProfit(int[] prices) {

        if (prices.length == 0)
            return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            int profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, profit);

            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int result = maxProfit(prices);

        System.out.println(result);

        sc.close();
    }
}