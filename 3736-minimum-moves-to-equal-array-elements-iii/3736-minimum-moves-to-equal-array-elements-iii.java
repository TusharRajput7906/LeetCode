class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int num : nums) {
            max = Math.max(max, num);
        }

        int count = 0;

        for(int num : nums) {
            count += max - num;
        }

        return count;
    }
}