package com.lzu.edu.lk;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * @author junqiangliu
 *	二叉搜索树的第K大节点
 */
public class Offer54 {
	public int kthLargest(TreeNode root, int k) {
		List<Integer> lists = midTravel(root);
		return lists.get(lists.size()-k);
    }
	public static List<Integer> midTravel(TreeNode root) {
		Stack<TreeNode> stack=new Stack<>();
		List<Integer> res=new ArrayList<>();
		while(root!=null||!stack.isEmpty()) {
			while(root!=null) {
				stack.push(root.left);
				root=root.left;
			}
			if(!stack.isEmpty()) {
				root=stack.pop();
				res.add(root.val);
				root=root.right;
			}
		}
		return res;
	}
}
