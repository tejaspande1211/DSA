# Input example:
# nums = [-1, 0, 1, 2, -1, -4]
#
# Expected Output:
# [[-1, -1, 2], [-1, 0, 1]]

from typing import List

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()   # Sort to use two-pointer technique
        n = len(nums)

        for i in range(n - 2):
            # Skip duplicate fixed elements
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            left = i + 1
            right = n - 1

            while left < right:
                total = nums[i] + nums[left] + nums[right]

                if total == 0:
                    result.append([nums[i], nums[left], nums[right]])

                    # Skip duplicate left values
                    while left < right and nums[left] == nums[left + 1]:
                        left += 1
                    # Skip duplicate right values
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1

                    left += 1
                    right -= 1

                elif total < 0:
                    left += 1
                else:
                    right -= 1

        return result


# -------- Driver Code (User Input) --------
if __name__ == "__main__":
    # Take input from user
    nums = list(map(int, input("Enter numbers separated by space: ").split()))

    sol = Solution()
    output = sol.threeSum(nums)

    print("Output:")
    print(output)
