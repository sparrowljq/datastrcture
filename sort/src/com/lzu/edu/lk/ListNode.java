package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu 链表节点
 */
public class ListNode {
	int val;
	ListNode next;

	public ListNode() {
		super();
	}

	ListNode(int x) {
		val = x;
		next = null;
	}

	public ListNode(int val, ListNode next) {
		super();
		this.val = val;
		this.next = next;
	}
}
