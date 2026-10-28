import java.util.*;

class Solution {
    public int minSubarray(int[] nums, int p) {
        HashMap<Long, Integer> h1 = new HashMap<>();

        int n = nums.length;
        long sum = 0;

        for (int num : nums) {
            sum += num;
        }

        long rem = sum % p;

        if (rem == 0) return 0;

        h1.put(0L, -1);

        long prefix = 0;
        int min = n;

        for (int i = 0; i < n; i++) {
            prefix = (prefix + nums[i]) % p;

            long target = (prefix - rem + p) % p;

            if (h1.containsKey(target)) {
                min = Math.min(min, i - h1.get(target));
            }

            h1.put(prefix, i);
        }

        return min == n ? -1 : min;
    }
}