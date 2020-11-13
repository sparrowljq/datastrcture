package com.lzu.edu.lk;

import com.lzu.edu.lk.JZ07.TreeNode;

public class offer55_02 {
	public boolean isBalanced(TreeNode root) {
		if(root==null)return true;
		if(!isBalanced(root.left)) {
			return false;
		}
		if(!isBalanced(root.right)) {
			return false;
		}
		int tmp=Math.abs(heigh(root.left)-heigh(root.right));
		if(tmp>1) {
			return false;
		}
		return true;
    }
	public int heigh(TreeNode root) {
		if(root==null) return 0;
		return Math.max(heigh(root.left),heigh(root.right))+1;
	}
}
