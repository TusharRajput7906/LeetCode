class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int prod = nums[i];
            if (prod < k) {
                count++;
            } else {
                continue;
            }
            int j = i + 1;
            while (j < n) {
                prod *= nums[j];
                if (prod < k) {
                    count++;
                } else {
                    break;
                }
                j++;
            }
        }
        return count;
    }
}