package com.lzu.edu.lk;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author junqiangliu
 * 求根到叶节点数字之和(树的思想用递归)
 */
public class Offer129 {
	public int sumNumbers(TreeNode root) {
		return dfs(root, 0);
    }
	public int dfs(TreeNode root,int preNum) {
		if(root==null) {
			return 0;
		}
		int sum=preNum*10+root.val;
		if(root.left==null&&root.right==null) {
			return sum;
		}else {
			return dfs(root.left, sum)+dfs(root.right,sum);
		}
	}
	
	public int sumNumbers1(TreeNode root) {
		int res=0;
		Queue<TreeNode> queue=new LinkedList<>();
		Queue<Integer> datas=new LinkedList<>();
		if(root!=null) {
			queue.add(root);
			datas.add(root.val);
		}
		while(!queue.isEmpty()) {
			TreeNode node=queue.poll();
			int num=datas.poll();
			if(node.left==null&&node.right==null) {
				res+=num;
			}
			if(node.left!=null) {
				queue.add(node.left);
				datas.add(node.left.val+num*10);
			}
			if(node.right!=null) {
				queue.add(node.right);
				datas.add(node.right.val+num*10);
			}
		}
		return res;
	}
}
