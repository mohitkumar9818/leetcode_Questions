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
//     
//     seen = {}
//     for i, num in enumerate(nums):
//
//         complement = target - num
//        
//         if complement in seen:
//             return [seen[complement], i]
//        
//         seen[num] = i
