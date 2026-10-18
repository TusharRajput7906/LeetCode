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
    public void cousin(TreeNode root,HashMap<Integer,List<Integer>> h,int depth){
        if(root==null) return;
         h.putIfAbsent(depth, new ArrayList<>());
          h.get(depth).add(root.val);
         cousin(root.left, h, depth + 1);
        cousin(root.right, h, depth + 1);
    }
    public boolean areSibling(TreeNode root, int x ,int y){
        if(root==null) return false;
        if(root.left!=null && root.right!=null){
            if((root.left.val==x && root.right.val==y) || (root.left.val==y && root.right.val==x)){
                return true;
            }
        }
         return areSibling(root.left, x, y) || areSibling(root.right, x, y);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        HashMap<Integer,List<Integer>> h=new HashMap<>();
        cousin(root, h, 0);
        int depthX=-1;
        int depthY=-1;

        for(int depth:h.keySet()){
            List<Integer> list=h.get(depth);
            if(list.contains(x)){
                depthX=depth;
            }
            if(list.contains(y)){
                depthY=depth;
            }
        }
        if(depthX==-1 || depthY==-1 || depthX!=depthY){
            return false;
        }
        return !areSibling(root,x,y);
    }
}