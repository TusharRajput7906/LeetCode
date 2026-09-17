class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int i = 0, j = 0;
        int sum = 0;
        int n = arr.length;

        int min = Integer.MAX_VALUE;
        int secM = Integer.MAX_VALUE;

        int[] best = new int[n];

        for (int k = 0; k < n; k++) {
            best[k] = Integer.MAX_VALUE;
        }

        while (i < n) {

            sum += arr[i];

            while (sum > target && j <= i) {
                sum -= arr[j];
                j++;
            }

            if (sum == target) {

                int len = i - j + 1;
                if (j > 0 && best[j - 1] != Integer.MAX_VALUE) {
                    secM = Math.min(secM, best[j - 1] + len);
                }
                min = Math.min(min, len);
            }
            if (i == 0) {
                best[i] = min;
            } else {
                best[i] = Math.min(best[i - 1], min);
            }

            i++;
        }

        if (secM == Integer.MAX_VALUE) {
            return -1;
        }

        return secM;
    }
}