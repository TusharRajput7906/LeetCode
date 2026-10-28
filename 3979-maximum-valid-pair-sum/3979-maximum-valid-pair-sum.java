
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int[] suff = new int[n];

        suff[n - 1] = nums[n - 1];

        // Suffix maximum
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = Math.max(suff[i + 1], nums[i]);
        }

        int ans = 0;

        for (int i = 0; i + k < n; i++) {
            int a = nums[i];
            int b = suff[i + k];

            ans = Math.max(ans, a + b);
        }

        return ans;
    }
}
