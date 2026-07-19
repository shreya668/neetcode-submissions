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
    TreeNode globalAncestor = null;

    public void findNodes(TreeNode root,  TreeNode p, TreeNode q) {
        if(root == null) return;

        if(root == p || root == q) {
            globalAncestor = root;
            return;
        }

        if(p.val < root.val && q.val < root.val) {
            findNodes(root.left, p, q);
        }

        if(p.val > root.val && q.val > root.val) {
            findNodes(root.right, p, q);
        }

        if(globalAncestor == null) globalAncestor = root;

    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        findNodes(root, p, q);

        return globalAncestor;
    }
}
