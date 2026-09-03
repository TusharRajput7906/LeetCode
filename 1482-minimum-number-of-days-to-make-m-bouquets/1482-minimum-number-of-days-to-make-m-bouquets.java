class Solution {
    public boolean bloomed(int[] arr, int m, int k, int mid) {
        int flower = 0;
        int bouquets = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= mid) {
                flower++;
                if (flower == k) {
                    bouquets++;
                    flower = 0;
                }
            } else {
                flower = 0;
            }
        }
        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if (n < m * k)
            return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }
        int low = min;
        int high = max;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (bloomed(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }
}