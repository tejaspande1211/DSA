import java.util.*;

class SortedRotatedChecker {
    
    /*
     * Problem: Check if Array Is Sorted and Rotated
     * 
     * Question:
     * Given an array nums, return true if the array was originally sorted in non-decreasing order,
     * then rotated some number of positions (including zero). Otherwise, return false.
     * 
     * There may be duplicates in the original array.
     * 
     * Note: An array A rotated by x positions results in an array B of the same length such that
     * B[i] == A[(i + x) % A.length] for every valid index i.
     * 
     * Examples:
     * 
     * Input: nums = [3, 4, 5, 1, 2]
     * Output: true
     * Explanation: [1, 2, 3, 4, 5] is the original sorted array.
     *              You can rotate the array by x = 2 positions to begin on the element of value 3: [3, 4, 5, 1, 2].
     * 
     * Input: nums = [2, 1, 3, 4]
     * Output: false
     * Explanation: There is no sorted array once rotated that can make nums.
     * 
     * Input: nums = [1, 2, 3]
     * Output: true
     * Explanation: [1, 2, 3] is the original sorted array.
     *              You can rotate the array by x = 0 positions (no rotation) to make nums.
     * 
     * Input: nums = [1, 1, 1]
     * Output: true
     * Explanation: [1, 1, 1] is the original sorted array (with duplicates).
     *              Any rotation will still result in [1, 1, 1].
     */
    
    public boolean check(int[] nums) {
        int n = nums.length;
        int breaks = 0;  // Count the number of breaks in sorted order
        
        // Check each position to see if there's a break in sorted order
        for (int i = 0; i < n; i++) {
            // Calculate next index (wrap around using modulo)
            int next = (i + 1) % n;
            
            // If current element is greater than next element, it's a break
            if (nums[i] > nums[next]) {
                breaks++;
            }
            
            // If there are more than 1 break, array cannot be sorted and rotated
            if (breaks > 1) {
                return false;
            }
        }
        
        // Array is sorted and rotated if there's at most 1 break
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortedRotatedChecker solution = new SortedRotatedChecker();
        
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Check if array is sorted and rotated
        boolean result = solution.check(nums);
        
        // Print the result
        System.out.println("\nIs the array sorted and rotated? " + result);
        
        // Print array for reference
        System.out.print("Input array: ");
        System.out.println(Arrays.toString(nums));
        
        sc.close();
    }
}

// **Sample Run 1:**
// Enter the size of array:
// 5
// Enter 5 elements:
// 3 4 5 1 2

// Is the array sorted and rotated? true
// Input array: [3, 4, 5, 1, 2]


// **Sample Run 2:**
// Enter the size of array:
// 4
// Enter 4 elements:
// 2 1 3 4

// Is the array sorted and rotated? false
// Input array: [2, 1, 3, 4]


// **Sample Run 3:**
// Enter the size of array:
// 3
// Enter 3 elements:
// 1 2 3

// Is the array sorted and rotated? true
// Input array: [1, 2, 3]


// **Sample Run 4:**
// Enter the size of array:
// 3
// Enter 3 elements:
// 1 1 1

// Is the array sorted and rotated? true
// Input array: [1, 1, 1]