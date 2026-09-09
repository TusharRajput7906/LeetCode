class Solution {
    public int count(int n) {
        int c = 0;
        while (n > 0) {
            c += (n % 10);
            n /= 10;
        }
        return c;
    }

    public int countBalls(int lowLimit, int highLimit) {
        int[] arr = new int[46];
        int max = Integer.MIN_VALUE;
        for (int i = lowLimit; i <= highLimit; i++) {
            int val = count(i);
            arr[val] = arr[val] + 1;
            max = Math.max(max, arr[val]);
        }
        return max;
    }
}