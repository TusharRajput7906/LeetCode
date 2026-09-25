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
    public boolean path(TreeNode root,int target,int total){
        if(root==null) return false;
        total+=root.val;
        if(root.left==null && root.right==null){
            return target==total;
        }
        return path(root.left,target,total)||path(root.right,target,total);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
       return path(root,targetSum,0);
    }
}