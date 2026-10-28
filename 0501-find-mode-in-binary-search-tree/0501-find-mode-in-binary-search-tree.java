/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer, Integer> h = new HashMap<>();

    public void freq(TreeNode root) {
        if (root == null)
            return;
        h.put(root.val, h.getOrDefault(root.val, 0) + 1);
        freq(root.left);
        freq(root.right);
    }

    public int[] findMode(TreeNode root) {
        freq(root);
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int val : h.keySet()) {
            max = Math.max(max, h.get(val));
        }
        for (int val : h.keySet()) {
            if (max == h.get(val)) {
                list.add(val);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}