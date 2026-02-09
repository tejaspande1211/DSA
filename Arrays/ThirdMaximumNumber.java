import java.util.Scanner;

/*
Question:
Given an integer array nums, return the third distinct maximum number in the array.
If the third distinct maximum does not exist, return the maximum number.

Input Format:
- First line contains an integer n, the number of elements in the array.
- Second line contains n space-separated integers representing the array elements.

Output Format:
- Print the third distinct maximum number.
- If the third distinct maximum does not exist, print the maximum number.

Example 1:
Input:
3
3 2 1

Output:
Third maximum number: 1

Example 2:
Input:
2
1 2

Output:
Third maximum number: 2

Example 3:
Input:
4
2 2 3 1

Output:
Third maximum number: 1
*/

public class ThirdMaximumNumber {

    // Function to find third distinct maximum
    public static int thirdMax(int[] nums) {
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (int num : nums) {

            // Skip duplicate values
            if ((firstMax != null && num == firstMax) ||
                (secondMax != null && num == secondMax) ||
                (thirdMax != null && num == thirdMax)) {
                continue;
            }

            if (firstMax == null || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } 
            else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } 
            else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        // If third distinct maximum does not exist, return maximum
        return thirdMax != null ? thirdMax : firstMax;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Read array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = thirdMax(nums);

        // Display result
        System.out.println("Third maximum number: " + result);

        sc.close();
    }
}
