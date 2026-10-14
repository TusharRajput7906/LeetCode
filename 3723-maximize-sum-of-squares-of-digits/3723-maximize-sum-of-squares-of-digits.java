class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
            return "";
        }
        int[] arr = new int[num];
        int i = num - 1;
        int dig = 9;
        while (sum > 0) {
            if (dig <= sum) {
                arr[i--] = dig;
                sum -= dig;
                dig = 9;
            } else {
                while (dig > sum) {
                    dig--;
                }
            }
        }
        StringBuilder ans = new StringBuilder();

        for (int j = num - 1; j >= 0; j--) {
            ans.append(arr[j]);
        }

        return ans.toString();
    }
}