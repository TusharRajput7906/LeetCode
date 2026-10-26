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
    List<List<Integer>> li = new ArrayList<>();

    public void zigzag(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == li.size()) {
            li.add(new ArrayList<>());
        }
        li.get(level).add(root.val);
        zigzag(root.left, level + 1);
        zigzag(root.right, level + 1);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        zigzag(root, 0);
        for (int i = 0; i < li.size(); i++) {
            if (i % 2 != 0) {
                Collections.reverse(li.get(i));
            }
        }
        return li;
    }
}