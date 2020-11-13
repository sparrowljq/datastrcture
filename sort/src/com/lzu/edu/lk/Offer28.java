package com.lzu.edu.lk;

/**
 * 
 * @author junqiangliu 对称的二叉树
 */
public class Offer28 {
	public static boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return isdui(root.left, root.right);
	}

	public static boolean isdui(TreeNode node1, TreeNode node2) {
		if (node1.val != node2.val)
			return false;
		if (node1.left.val != node2.right.val)
			return false;
		if (node1.right.val != node2.left.val)
			return false;
		if (!isdui(node1.left, node2.right))
			return false;
		if (!isdui(node1.right, node2.left))
			return false;
		return true;
	}
}
