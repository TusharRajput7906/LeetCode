class Solution {
    public boolean div(int n) {
        int m = n;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 0 || m % rem != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> li = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (div(i)) {
                li.add(i);
            }
        }
        return li;
    }
}