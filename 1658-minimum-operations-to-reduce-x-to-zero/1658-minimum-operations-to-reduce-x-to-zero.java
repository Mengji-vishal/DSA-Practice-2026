class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int target = totalSum - x;
        
        if (target < 0) {
            return -1;
        }
        
        int l = 0;
        int r = 0;
        int currentSum = 0;
        int maxLength = -1;
        
        while (r < nums.length) {
            currentSum += nums[r];
            
            while (currentSum > target && l <= r) {
                currentSum -= nums[l];
                l++;
            }
            
            if (currentSum == target) {
                maxLength = Math.max(maxLength, r - l + 1);
            }
            
            r++;
        }
        
        if (maxLength == -1) {
            return -1;
        }
        
        return nums.length - maxLength;
    }
}