class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int srow = 0, erow = n - 1, scol = 0, ecol = m - 1;
        List<Integer> li = new ArrayList<>();
        while (srow <= erow && scol <= ecol) {
            for (int i = scol; i <= ecol; i++) {
                li.add(matrix[srow][i]);
            }
            srow++;
            if (srow > erow) break;
            for (int i = srow ; i <= erow; i++) {
                li.add(matrix[i][ecol]);
            }
            ecol--;
            if (scol > ecol) break;
            for (int i = ecol; i >= scol; i--) {
                // if (srow == erow)
                //     break;
                li.add(matrix[erow][i]);
            }
            erow--;
            for (int i = erow; i >= srow; i--) {
                // if (scol == ecol)
                //     break;
                li.add(matrix[i][scol]);
            }
            scol++;
        }
        return li;
    }
}