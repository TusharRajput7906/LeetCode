class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h = new HashSet<>();
        
        for (int i = 0; i < nums1.length; i++) {
            h.add(nums1[i]);
        }

        HashSet<Integer> ansSet = new HashSet<>();

        for (int i = 0; i < nums2.length; i++) {
            if (h.contains(nums2[i])) {
                ansSet.add(nums2[i]);
            }
        }

        int[] ans = new int[ansSet.size()];
        int i = 0;

        for (int val : ansSet) {
            ans[i++] = val;
        }

        return ans;
    }
}