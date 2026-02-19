/*
TOXIC WASTE MANAGEMENT
Problem Statement:
A waste management facility needs to select waste containers to reach a target weight while minimizing toxicity. 
You are given N containers, each with a specific weight and toxicity level. Your task is to find two containers 
whose combined weight equals the target weight. If multiple pairs exist, select the pair with the minimum total toxicity.

Input Format:
The input is a single array containing:
- First element: N (number of containers)
- Second element: Target weight
- Next 2*N elements: Alternating weight and toxicity values
Format: [N, Target, weight[0], toxic[0], weight[1], toxic[1], ..., weight[N-1], toxic[N-1]]

Output Format:
The output should be an array of three integers:
- Index of the first container (0-based indexing)
- Index of the second container (0-based indexing)
- Total toxicity of the selected pair
Format: [index1, index2, total_toxicity]

If multiple valid pairs exist with the same minimum toxicity, return the pair with the smallest first index. 
If there's still a tie, return the pair with the smallest second index.

Example:
Input: [5, 10, 3, 4, 4, 6, 2, 3, 5, 5, 6, 7]
Explanation:
- N = 5, Target = 10
- Container 0: weight = 3, toxicity = 4
- Container 1: weight = 4, toxicity = 6
- Container 2: weight = 2, toxicity = 3
- Container 3: weight = 5, toxicity = 5
- Container 4: weight = 6, toxicity = 7
- Pair: weight[1] + weight[4] = 4 + 6 = 10 (equals target)
- Total toxicity: toxicity[1] + toxicity[4] = 6 + 7 = 13
Output: [1, 4, 13]

Constraints:
2 ≤ N ≤ 10^5
1 ≤ weight[i] ≤ 10^9
1 ≤ toxic[i] ≤ 10^9
*/

import java.util.*;

public class ToxicWasteManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        
        int[] weight = new int[n];
        int[] toxic = new int[n];
        
        // Read alternating weight and toxicity values
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
            toxic[i] = sc.nextInt();
        }
        
        int minToxicity = Integer.MAX_VALUE;
        int idx1 = -1, idx2 = -1;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (weight[i] + weight[j] == target) {
                    int totalToxic = toxic[i] + toxic[j];
                    if (totalToxic < minToxicity) {
                        minToxicity = totalToxic;
                        idx1 = i;
                        idx2 = j;
                    }
                }
            }
        }
        
        System.out.println(idx1 + " " + idx2 + " " + minToxicity);
    }
}
