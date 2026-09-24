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
    TreeNode dummy=new TreeNode(0);
    TreeNode prev=dummy;
    public void right(TreeNode root){
        if(root==null) return;
        right(root.left);
        prev.right=new TreeNode(root.val);
        prev=prev.right;
        right(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        right(root);
        return dummy.right;
    }
}