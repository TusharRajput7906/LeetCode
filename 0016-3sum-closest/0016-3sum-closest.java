class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < n - 2; i++) {
            int low = i + 1;
            int high = n - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
                if (target == sum) {
                    return sum;
                }
                if (sum > target) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return closest;
    }
}