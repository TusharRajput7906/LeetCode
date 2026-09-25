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
        public int leftSum(TreeNode root,int total){
            if(root==null) return 0;
            if(root.left!=null && root.left.left==null && root.left.right==null){
               total+=root.left.val;
                }
            return total+ leftSum(root.left,0)+leftSum(root.right,0);
        }
        public int sumOfLeftLeaves(TreeNode root) {
            return leftSum(root,0);
        }
    }