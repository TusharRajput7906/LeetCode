class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int[] arr = new int[matrix.length];
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                min = Math.min(matrix[i][j], min);
            }
            arr[i] = min;
        }
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                max = Math.max(matrix[j][i], max);
            }
            for (int j = 0; j < n; j++) {
                if (arr[j] == max) {
                    l.add(arr[j]);
                }
            }
        }

        return l;
    }
}