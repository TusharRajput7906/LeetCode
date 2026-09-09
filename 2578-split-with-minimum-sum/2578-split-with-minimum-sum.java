class Solution {
    public int len(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public int splitNum(int num) {
        int[] arr = new int[len(num)];
        int l = 0;
        while (num > 0) {
            arr[l] = num % 10;
            num /= 10;
            l++;
        }
        Arrays.sort(arr);
        int val = 0, val1 = 0;
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (i % 2 == 0) {
                val = val * 10 + arr[i];
            } else {
                val1 = val1 * 10 + arr[i];
            }
            i++;
        }
        return val + val1;
    }
}