class Solution {
    public int maximumUnits(int[][] arr, int truckSize) {
        Arrays.sort(arr, (a, b) -> {
            return b[1] - a[1];
        });
        int n = arr.length;
        int m = arr[0].length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int pro = 1;
            if (truckSize == 0)
                return sum;
            if (truckSize >= arr[i][0]) {
                pro = arr[i][0] * arr[i][1];
                truckSize -= arr[i][0];
            } else if (arr[i][0] > truckSize) {
                pro = truckSize * arr[i][1];
                truckSize = 0;
            }
            sum += pro;
        }
        return sum;
    }
}