class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
}

//code in python

// def twoSum(nums, target):
//     # Create a dictionary to store the index of visited numbers
//     seen = {}
//     for i, num in enumerate(nums):
//         # Calculate the complement needed to reach the target
//         complement = target - num
//         # Check if the complement is already in the dictionary
//         if complement in seen:
//             return [seen[complement], i]
//         # Store the number and its index in the dictionary
//         seen[num] = i
