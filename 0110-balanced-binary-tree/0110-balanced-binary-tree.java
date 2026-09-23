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
    public int isBal(TreeNode root) {
        if (root == null)
            return 1;
        int left = isBal(root.left);
        if (left == -1)
            return -1;
        int right = isBal(root.right);
        if (right == -1)
            return -1;
        if (Math.abs(left - right) > 1)
            return -1;
        return 1 + Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {
        return isBal(root) != -1;
    }
}