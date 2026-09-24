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
    public TreeNode invert(TreeNode root){
        if(root==null) return null;
        TreeNode newRoot=new TreeNode(root.val);
        newRoot.right=invert(root.left);
        newRoot.left=invert(root.right);
        return newRoot;
    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        return invert(root);

    }
}