class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int ch = s.charAt(i) - 'a';
            int idx = 26 - ch;
            sum += (idx * (i + 1));

        }
        return sum;
    }
}