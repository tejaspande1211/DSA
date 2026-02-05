def two_sum(nums, target):
    seen = {}  # number -> index
    for i in range(len(nums)):
        complement = target - nums[i]
        if complement in seen:
            return [seen[complement], i]
        seen[nums[i]] = i
    raise ValueError("No two sum solution")


def main():
    n = int(input("Enter number of elements: "))
    print("Enter elements:")
    nums = list(map(int, input().split()))
    if len(nums) != n:
        print("Error: Number of elements does not match n")
        return
    target = int(input("Enter target: "))
    result = two_sum(nums, target)
    print(f"Indices: {result}")


if __name__ == "__main__":
    main()
"""
Example Input:
Enter number of elements: 4
Enter elements:
2 7 11 15
Enter target: 9

Example Output:
Indices: [0, 1]

Explanation:
nums[0] + nums[1] = 2 + 7 = 9
"""
