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
    List<List<Integer>> li=new ArrayList<>();
    List<Integer> l = new ArrayList<>();
    public void path(TreeNode root,int target){
        if(root==null) return;
        l.add(root.val);
        target-=root.val;
        if(target==0 && root.left==null && root.right==null){
            li.add(new ArrayList<>(l));
        }
        path(root.left,target);
        path(root.right,target);
        l.remove(l.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        path(root,targetSum);
        return li;
    }
}