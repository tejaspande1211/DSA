import java.util.Scanner;

/*
 * Problem Statement:
 * A chocolate factory is packing chocolates into packets represented as an array of N integers.
 * The task is to find the empty packets (0) and push them to the end of the array,
 * while maintaining the order of non-zero elements.
 *
 * Sample test case:
 * Input:  N=8, arr = [4, 5, 0, 1, 9, 0, 5, 0]
 * Output: [4, 5, 1, 9, 5, 0, 0, 0]
 */
public class PushZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] result = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) result[j++] = arr[i];
        }
        for (int i = 0; i < n; i++) System.out.print(result[i] + " ");
    }
}