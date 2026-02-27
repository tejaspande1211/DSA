import java.util.Scanner;

/*
 * Problem Statement:
 * Given an array of N integers, find the second largest element in the array.
 *
 * Sample test case:
 * Input:  N=5, arr = [12, 35, 1, 10, 34]
 * Output: 34
 */
public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) { second = first; first = num; }
            else if (num > second && num != first) second = num;
        }
        System.out.println(second);
    }
}