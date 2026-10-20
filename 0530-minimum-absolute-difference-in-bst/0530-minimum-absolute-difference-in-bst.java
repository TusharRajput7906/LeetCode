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
    int val = Integer.MAX_VALUE;
    TreeNode prev = null;

    public void diff(TreeNode root) {
        if (root == null)
            return;
        diff(root.left);
        if (prev != null) {
            val = Math.min(val, Math.abs(root.val - prev.val));
        }
        prev = root;
        diff(root.right);
    }

    public int getMinimumDifference(TreeNode root) {
        diff(root);
        return val;
    }
}