/*
Question:
Replace elements by its rank in the array

Given an array arr of N integers, replace each element with its rank.
The rank of an element is defined as its position when the array is sorted
in ascending order (starting from 1).

If two or more elements are the same, they get the same rank
as their first occurrence in the sorted array.

Example:

Input:
N = 6
arr = [20, 15, 26, 2, 98, 6]

Output:
[4, 3, 5, 1, 6, 2]

Explanation:
After sorting: [2, 6, 15, 20, 26, 98]

Rank(2) = 1
Rank(6) = 2
Rank(15) = 3
Rank(20) = 4
Rank(26) = 5
Rank(98) = 6
*/

import java.util.*;

public class ReplaceElementsWithRankSolution {

    public static void main(String[] args) {

        int[] arr = {20, 15, 26, 2, 98, 6};
        int[] result = replaceWithRank(arr, arr.length);

        System.out.println(Arrays.toString(result));
        // Expected: [4, 3, 5, 1, 6, 2]
    }

    public static int[] replaceWithRank(int[] arr, int N) {

        // Step 1: Copy and sort the array
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        // Step 2: Assign ranks using HashMap
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int num : sorted) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        // Step 3: Replace original values with ranks
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}