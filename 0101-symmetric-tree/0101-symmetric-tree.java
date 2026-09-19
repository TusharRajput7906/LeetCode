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
    public boolean symmetric(TreeNode rootL, TreeNode rootR) {
        if ((rootL == null && rootR != null) || (rootL != null && rootR == null)) {
            return false;
        }
        if (rootL == null && rootR == null)
            return true;
        if (rootL.val != rootR.val)
            return false;
        return symmetric(rootL.left, rootR.right) && symmetric(rootL.right, rootR.left);
    }

    public boolean isSymmetric(TreeNode root) {
        // if (root == null)
        //     return true;
        return symmetric(root.left, root.right);
    }
}