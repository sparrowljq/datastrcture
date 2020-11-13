package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	递归的方式逆序遍历
 */

import java.util.ArrayList;
import java.util.List;

public class Offer06_1 {
	List<Integer> tmp=new ArrayList<Integer>();
	public int[] reversePrint(ListNode head) {
		travel(head);
		int[] res=new int[tmp.size()];
		for(int i=0;i<tmp.size();i++) {
			res[i]=tmp.get(i);
		}
		return res;
	}
	public void travel(ListNode head) {
		if(head==null) return;
		travel(head.next);
		tmp.add(head.val);
	}
}
