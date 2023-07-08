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
class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        
        // Temp node that swaps left and right children, then just do DFS recursive calls on left and right subtreeS

        TreeNode temp = root.left;
        root.left = root.right;
        root.right =temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
