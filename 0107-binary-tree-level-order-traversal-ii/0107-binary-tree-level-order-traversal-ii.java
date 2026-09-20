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
    public void levelOrder(TreeNode root, HashMap<Integer, List<Integer>> h, int level) {
        if (root == null)
            return;
        if (h.containsKey(level)) {
            h.get(level).add(root.val);
        } else {
            h.put(level, new ArrayList<>());
            h.get(level).add(root.val);
        }
        levelOrder(root.left, h, level + 1);
        levelOrder(root.right, h, level + 1);
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> li = new ArrayList<>();
        if (root == null)
            return new ArrayList<>();
        HashMap<Integer, List<Integer>> h = new HashMap<>();
        levelOrder(root, h, 0);
        li.addAll(h.values());
        Collections.reverse(li);
        return li;
    }
}