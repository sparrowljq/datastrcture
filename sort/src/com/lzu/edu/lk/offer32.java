package com.lzu.edu.lk;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 * 
 * @author junqiangliu
 *	二叉树层序遍历
 */
public class offer32 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res=new ArrayList<>();
		Queue<TreeNode> queue=new LinkedList<>();
		if(root!=null) queue.add(root);
		while(!queue.isEmpty()) {
			List<Integer> tmp=new ArrayList<>();
			int len=queue.size();
			for(int i=len-1;i>=0;i--) {
				TreeNode node=queue.poll();
				if(node!=null) {
					tmp.add(node.val);
					queue.offer(node.left);
					queue.offer(node.right);
				}
			}
			if(tmp.size()>0) res.add(tmp);
		}
		return res;
    }
}
