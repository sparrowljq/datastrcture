package com.lzu.edu.lk;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 
 * @author junqiangliu
 *	
 */
public class Offer32_03 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res=new ArrayList<>();
		Queue<TreeNode> queue=new LinkedList<>();
		if(root!=null) queue.add(root);
		while(!queue.isEmpty()) {
			LinkedList<Integer> tmp=new LinkedList<>();
			int len=queue.size();
			for(int i=len-1;i>=0;i++) {
				TreeNode node = queue.poll();
				if(node!=null) {
					if(res.size()%2==0) {
						tmp.addLast(node.val);
					}else {
						tmp.addFirst(node.val);
					}
					queue.offer(node.left);
					queue.offer(node.right);
				}
			}
			if(tmp.size()>0) res.add(tmp);
		}
		return res;
	}
}
