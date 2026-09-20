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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //LCA is an ancestor of both nodes p & q
        if(root==null) return null;
        if(p==null||q==null) return root;

        //if both nodes are less than root, then LCA lies in left subtree
        if(p.val<root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p,q);
        }
        //if both nodes are greater than root, then LCA lies in right subtree
        if(p.val>root.val && q.val>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        //else
        return root;
    }
}
