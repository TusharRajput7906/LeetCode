class Solution {
    public int mirrorDistance(int n) {
        String str=Integer.toString(n);
        str = new StringBuilder(str).reverse().toString();
        int m=Integer.parseInt(str);
        return Math.abs(n-m);
    }
}