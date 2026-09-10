class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int srow = 0, erow = n - 1, scol = 0, ecol = m - 1;
        List<Integer> li = new ArrayList<>();
        while (srow <= erow && scol <= ecol) {
            for (int i = scol; i <= ecol; i++) {
                li.add(matrix[srow][i]);
            }
            for (int i = srow + 1; i <= erow; i++) {
                li.add(matrix[i][ecol]);
            }
            for (int i = ecol - 1; i >= scol; i--) {
                if (srow == erow)
                    break;
                li.add(matrix[erow][i]);
            }
            for (int i = erow-1; i >= srow + 1; i--) {
                if (scol == ecol)
                    break;
                li.add(matrix[i][scol]);
            }
            srow++;
            erow--;
            scol++;
            ecol--;
        }
        return li;
    }
}