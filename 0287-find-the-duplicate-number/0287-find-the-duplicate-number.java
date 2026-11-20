class Solution {
    public int findDuplicate(int[] nums) {
        boolean flag[] = new boolean[nums.length];
        for (int i : nums) {
            if (flag[i])
                return i;
            flag[i] = true;
        }
        return -1;
    }
}