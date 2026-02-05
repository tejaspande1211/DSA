import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        // Input array
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        // Call twoSum method
        int[] result = twoSum(nums, target);
        // Output result
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        sc.close();
    }
}

/*
Example Input:
Enter number of elements: 4
Enter elements:
2 7 11 15
Enter target: 9

Example Output:
Indices: [0, 1]

Explanation:
nums[0] + nums[1] = 2 + 7 = 9
*/
