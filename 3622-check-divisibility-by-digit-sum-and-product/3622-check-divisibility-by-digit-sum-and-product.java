class Solution {
    public boolean checkDivisibility(int n) {
        long sum = 0;
        long mul = 1;
        String m = Integer.toString(n);
        for (int i = 0; i < m.length(); i++) {
            int a = m.charAt(i) - '0';
            sum += a;
            mul *= a;
        }
        long ans = mul + sum;
        if (n % ans == 0) {
            return true;
        }
        return false;
    }
}