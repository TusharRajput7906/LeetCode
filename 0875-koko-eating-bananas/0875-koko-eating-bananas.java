class Solution {
    public boolean Eating(int[] arr, int h, int mid) {
        long count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % mid == 0) {
                count += arr[i] / mid;
            } else {
                count += (arr[i] / mid) + 1;
            }
        }
        if (count <= h) {
            return true;
        }
        return false;
    }

    public int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public int minEatingSpeed(int[] arr, int h) {
        int n = arr.length;
        int low = 1;
        int high = max(arr);
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (Eating(arr, h, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}