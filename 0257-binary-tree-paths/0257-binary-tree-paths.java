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
    public void dfs(TreeNode root,String path, List<String> list){
        if(root==null) return;
        path+=root.val;
        if(root.left==null && root.right==null){
            list.add(path);
        }else{
            dfs(root.left,path+"->",list);
            dfs(root.right,path+"->",list);
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        dfs(root,"",list);
        return list;
    }
}