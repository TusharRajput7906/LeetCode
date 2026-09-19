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
    // public List<Integer> order(TreeNode root,List<Integer> li){
    //     if(root==null) return null;
    //     order(root.left,li);           //correct also
    //     li.add(root.val);
    //     order(root.right,li);
    //     return li;
    // }
     public void order(TreeNode root,List<Integer> li){
        if(root==null) return;
        order(root.left,li);
        li.add(root.val);
        order(root.right,li);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        if(root==null) return li;
        order(root,li);
        return li;
    }
}