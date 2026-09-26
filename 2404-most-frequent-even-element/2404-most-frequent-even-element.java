class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            h.put(nums[i], h.getOrDefault(nums[i], 0) + 1);
        }
        int maxVal = -1;
        int minKey = -1;
        for (int key : h.keySet()) {
            if (key % 2 == 0) {
                int val = h.get(key);
                if (maxVal < val) {
                    minKey = key;
                    maxVal = val;
                } else if (maxVal == val) {
                    if (key < minKey) {
                        minKey = key;
                    }
                }
            }
        }
        return minKey;
    }
}