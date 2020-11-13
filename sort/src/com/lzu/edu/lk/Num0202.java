package com.lzu.edu.lk;

public class Num0202 {
	//定义节点
	class ListNode{
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public int kthToLast(ListNode head, int k) {
		ListNode p=head;
		int len=0,i=0;
		while(p!=null) {
			len++;
			p=p.next;
		}
		p=head;
		while(i<(len-k)) {
			p=p.next;
			i++;
		}
		return p.val;
	}
}
