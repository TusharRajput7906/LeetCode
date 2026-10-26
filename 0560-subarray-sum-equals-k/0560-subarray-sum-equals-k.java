class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int n = nums.length;
        int[] pref = new int[n];
        pref[0] = nums[0];
        int ans = 0;
        for (int i = 1; i < n; i++) {
            pref[i] = nums[i] + pref[i - 1];
        }
        for (int i = 0; i < n; i++) {
            int val = pref[i] - k;
            if (map.containsKey(val)) {
                ans+=map.get(val);
            }
            map.put(pref[i], map.getOrDefault(pref[i],0)+1);
        }
        return ans;
    }
}