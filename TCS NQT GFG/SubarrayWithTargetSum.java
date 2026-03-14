import java.util.*;

/*
 * Given an array of integers nums and an integer target,
 * your task is to find all contiguous subarrays whose sum equals the target.
 * Sample test case:
 * Input:
 * nums = [3, 4, -7, 1, 3, 3, 1, -4], target = 7
 * Output:
 * [3, 4]
 * [7] (i.e., 3+4=7, 1+3+3=7, etc.)
 */
public class SubarrayWithTargetSum {
    public static void main(String[] args) {
        int[] nums = { 3, 4, -7, 1, 3, 3, 1, -4 };
        int target = 7;
        int n = nums.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            int total = 0;
            for (int j = i; j < n; j++) {
                temp.add(nums[j]);
                total += nums[j];
                if (total == target) {
                    list.add(new ArrayList<>(temp));
                }
            }
        }
        System.out.println(list);
    }
}