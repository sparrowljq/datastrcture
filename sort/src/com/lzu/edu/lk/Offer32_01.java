package com.lzu.edu.lk;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Offer32_01 {
	public int[] levelOrder(TreeNode root) {
		List<Integer> res=new ArrayList<Integer>();
		Queue<TreeNode> queue=new LinkedList<>();
		if(root!=null) queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode node=queue.poll();
			res.add(node.val);
			if(node.left!=null) queue.offer(node.left);
			if(node.right!=null) queue.offer(node.right);
		}
		int[] res_arr=new int[res.size()];
		for(int i=0;i<res.size();i++) {
			res_arr[i]=res.get(i);
		}
		return res_arr;
	}
}
