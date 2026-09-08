class Solution {

    public int neg(int left, int right, int[] arr) {

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Found first negative element
            if (arr[mid] < 0) {

                if (mid == arr.length - 1 || arr[mid + 1] >= 0) {
                    return mid;
                }

                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public int pos(int left, int right, int[] arr) {

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Found first positive element
            if (arr[mid] > 0) {

                if (mid == 0 || arr[mid - 1] <= 0) {
                    return mid;
                }

                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public int maximumCount(int[] nums) {

        int left = 0, right = nums.length - 1;

        int pos = pos(left, right, nums);

        int positive;

        if (pos == -1) {
            positive = 0;
        } else {
            positive = nums.length - pos;
        }

        int neg = neg(left, right, nums);

        int negative;

        if (neg == -1) {
            negative = 0;
        } else {
            negative = neg + 1;
        }

        return positive > negative ? positive : negative;
    }
}