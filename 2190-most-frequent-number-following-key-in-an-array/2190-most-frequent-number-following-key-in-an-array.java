class Solution {
    public int mostFrequent(int[] nums, int key) {
        int n = nums.length;
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                if (i != n - 1) {
                    h.put(nums[i + 1], h.getOrDefault(nums[i + 1], 0) + 1);
                }
            }
        }
        int max = -1;
        int ans = 0;
        for (int val : h.keySet()) {
            int min = h.get(val);
            if (max < min) {
                max = min;
                ans = val;
            }
        }
        return ans;
    }
}