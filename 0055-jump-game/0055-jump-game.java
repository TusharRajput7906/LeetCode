class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return true;
        int maxIdx = 0;
        for (int i = 0; i < n; i++) {
            if (i > maxIdx) {
                return false;
            } else {
                maxIdx = Math.max(maxIdx, i + nums[i]);
            }
        }
        return true;
    }
}