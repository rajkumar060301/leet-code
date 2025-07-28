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
    boolean flag = false;

    public void findPath(TreeNode root, int currentSum, int targetSum) {
        if (root == null) {
            return;
        }
        currentSum += root.val;
        if (currentSum == targetSum && root.left == null && root.right == null) {
            flag = true;
            return;
        }
        findPath(root.left, currentSum, targetSum);
        findPath(root.right, currentSum, targetSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        int currentSum = 0;
        findPath(root, currentSum, targetSum);
        return flag;
    }
}