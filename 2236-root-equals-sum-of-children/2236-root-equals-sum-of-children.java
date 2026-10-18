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
    public boolean check(TreeNode root){
        if(root==null) return false;
        boolean left=check(root.left);
        boolean right=check(root.right);
        if(root.left!=null && root.right!=null && (root.left.val+root.right.val)==root.val){
            return true;
        }else if(root.left==null && root.right!=null && root.right.val==root.val){
            return true;
        }else if(root.left!=null && root.right==null && root.left.val==root.val){
            return true;
        }else{
           return false;
        }
        // return left && right;
    }
    public boolean checkTree(TreeNode root) {
        return check(root);
    }
}