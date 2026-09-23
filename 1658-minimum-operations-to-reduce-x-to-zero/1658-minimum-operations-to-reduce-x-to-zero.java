class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;

        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int target = total - x;

        if (target == 0) {
            return n;
        }

        int sum = 0;
        int j = 0;
        int maxLen = -1;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            while (sum > target && j <= i) {
                sum -= nums[j];
                j++;
            }

            if (sum == target) {
                maxLen = Math.max(maxLen, i - j + 1);
            }
        }

        return maxLen == -1 ? -1 : n - maxLen;
    }
}