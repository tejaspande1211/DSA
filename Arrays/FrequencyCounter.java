import java.util.*;

class FrequencyCounter {
    
    /*
     * Problem: Frequencies in a Limited Array
     * 
     * Question:
     * You are given an array arr[] containing positive integers. The elements in the array arr[]
     * range from 1 to n (where n is the size of the array), and some numbers may be repeated or
     * absent. Your task is to count the frequency of all numbers in the range 1 to n and return an
     * array of size n such that result[i] represents the frequency of the number i (1-based indexing).
     * 
     * Examples:
     * 
     * Input: arr[] = [2, 3, 2, 3, 5]
     * Output: [0, 2, 2, 0, 1]
     * Explanation: We have: 1 occurring 0 times, 2 occurring 2 times, 3 occurring 2 times,
     *              4 occurring 0 times, and 5 occurring 1 time.
     * 
     * Input: arr[] = [3, 3, 3, 3]
     * Output: [0, 0, 4, 0]
     * Explanation: We have: 1 occurring 0 times, 2 occurring 0 times, 3 occurring 4 times,
     *              and 4 occurring 0 times.
     */
    
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n];
        
        // Count frequencies of numbers from 1 to n only
        for (int num : arr) {
            // Only count if number is in valid range [1, n]
            if (num >= 1 && num <= n) {
                freq[num - 1]++;  // num is 1-based, array is 0-based
            }
        }
        
        // Convert frequency array to list
        List<Integer> result = new ArrayList<>();
        for (int count : freq) {
            result.add(count);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FrequencyCounter solution = new FrequencyCounter();
        
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (positive integers from 1 to n):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Get the frequency count
        List<Integer> result = solution.frequencyCount(arr);
        
        // Print the result
        System.out.println("Frequency Count:");
        System.out.println(result);
        
        // Print detailed explanation
        System.out.println("\nDetailed Explanation:");
        for (int i = 0; i < result.size(); i++) {
            System.out.println("Number " + (i + 1) + " occurs " + result.get(i) + " times");
        }
        
        sc.close();
    }
}

// **Sample Run 1:**
// Enter the size of array:
// 5
// Enter 5 elements (positive integers from 1 to n):
// 2 3 2 3 5
// Frequency Count:
// [0, 2, 2, 0, 1]

// Detailed Explanation:
// Number 1 occurs 0 times
// Number 2 occurs 2 times
// Number 3 occurs 2 times
// Number 4 occurs 0 times
// Number 5 occurs 1 times


// **Sample Run 2:**
// Enter the size of array:
// 4
// Enter 4 elements (positive integers from 1 to n):
// 3 3 3 3
// Frequency Count:
// [0, 0, 4, 0]

// Detailed Explanation:
// Number 1 occurs 0 times
// Number 2 occurs 0 times
// Number 3 occurs 4 times
// Number 4 occurs 0 times