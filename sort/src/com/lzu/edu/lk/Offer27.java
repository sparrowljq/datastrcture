package com.lzu.edu.lk;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author junqiangliu 二叉树的镜像
 */
public class Offer27 {
	public TreeNode mirrorTree(TreeNode root) {
		if(root==null) return null;
		TreeNode p=root.left;
		root.left=mirrorTree(root.right);
		root.right=mirrorTree(p);
		return root;
	}
	public TreeNode mirrorTree1(TreeNode root) {
		if(root==null) return null;
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode node=queue.poll();
			if(node!=null) {
				queue.add(node.left);
				queue.add(node.right);
				TreeNode p=node.left;
				node.left=node.right;
				node.right=p;
			}
		}
		return root;
	}
}
