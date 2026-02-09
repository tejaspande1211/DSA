import java.util.*;

class MissingNumber {
    
    /*
     * Problem: Missing Number
     * 
     * Question:
     * Given an array nums containing n distinct numbers in the range [0, n],
     * return the only number in the range that is missing from the array.
     * 
     * Examples:
     * 
     * Input: nums = [3, 0, 1]
     * Output: 2
     * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0, 3].
     *              2 is the missing number in the range since it does not appear in nums.
     * 
     * Input: nums = [0, 1]
     * Output: 2
     * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0, 2].
     *              2 is the missing number in the range since it does not appear in nums.
     * 
     * Input: nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
     * Output: 8
     * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0, 9].
     *              8 is the missing number in the range since it does not appear in nums.
     */
    
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // Calculate the expected sum of numbers from 0 to n
        // Formula: sum = n * (n + 1) / 2
        int needSum = n * (n + 1) / 2;
        
        // Calculate the actual sum of all elements in the array
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        // The missing number is the difference between expected and actual sum
        return needSum - sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MissingNumber solution = new MissingNumber();
        
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter " + n + " distinct numbers in range [0, " + n + "]:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Get the missing number
        int result = solution.missingNumber(nums);
        
        // Print the result
        System.out.println("Missing Number: " + result);
        
        // Print explanation
        System.out.println("\nExplanation:");
        System.out.println("Array has " + n + " numbers, so the range is [0, " + n + "]");
        System.out.println("The missing number in this range is: " + result);
        
        sc.close();
    }
}

// **Sample Run 1:**
// Enter the size of array:
// 3
// Enter 3 distinct numbers in range [0, 3]:
// 3 0 1
// Missing Number: 2

// Explanation:
// Array has 3 numbers, so the range is [0, 3]
// The missing number in this range is: 2


// **Sample Run 2:**
// Enter the size of array:
// 2
// Enter 2 distinct numbers in range [0, 2]:
// 0 1
// Missing Number: 2

// Explanation:
// Array has 2 numbers, so the range is [0, 2]
// The missing number in this range is: 2


// **Sample Run 3:**
// Enter the size of array:
// 9
// Enter 9 distinct numbers in range [0, 9]:
// 9 6 4 2 3 5 7 0 1
// Missing Number: 8

// Explanation:
// Array has 9 numbers, so the range is [0, 9]
// The missing number in this range is: 8