class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        if (m == 0 || n == 0) {
            return ans;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(".");
        }
        ans[0] = sb.toString();
        for (int i = 1; i < m; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    s.append(".");
                } else {
                    s.append("#");
                }
            }
            ans[i] = s.toString();
        }
        return ans;
    }
}