class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            l.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (l.contains(nums2[i])) {
                if (!h.contains(nums2[i])) {
                    h.add(nums2[i]);
                }
            }
        }
        int[] ans = new int[h.size()];
        int i = 0;
        for (int val : h) {
            ans[i++] = val;
        }
        return ans;
    }
}