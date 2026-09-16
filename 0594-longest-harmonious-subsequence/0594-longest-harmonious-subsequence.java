class Solution {
    public int findLHS(int[] arr) {
        int n = arr.length;
        int i = 1, j = 0;
        int max = 0;
        Arrays.sort(arr);
        while (i < n) {
            if (arr[i] - arr[j] == 0) {
                i++;
            } else if (arr[i] - arr[j] == 1) {
                max = Math.max(max, i - j + 1);
                i++;
            } else {
                j++;
            }
        }
        return max;
    }
}