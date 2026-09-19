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
    public void level(TreeNode root, HashMap<Integer, List<Integer>> h, int leve) {
        if (root == null)
            return;
        if (h.containsKey(leve)) {
            h.get(leve).add(root.val);
        } else {
            h.put(leve, new ArrayList<>());
            h.get(leve).add(root.val);
        }
        level(root.left, h, leve + 1);
        level(root.right, h, leve + 1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> li = new ArrayList<>();
        HashMap<Integer, List<Integer>> h = new HashMap<>();
        if (root == null)
            return new ArrayList<>();
        level(root, h, 0);
        li.addAll(h.values());
        return li;
    }
}