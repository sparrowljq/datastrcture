package com.lzu.edu.lk;

import java.util.PriorityQueue;

/**
 * 
 * @author junqiangliu 合并k个链表
 */
//status
//class Status implements Comparable<Status> {
//	int val;
//	ListNode ptr;
//
//	public Status(int val, ListNode ptr) {
//		super();
//		this.val = val;
//		this.ptr = ptr;
//	}
//
//	@Override
//	public int compareTo(Status o) {
//		return this.val - o.val;
//	}

	PriorityQueue<Status> queue = new PriorityQueue<>();

	public ListNode mergeKLists(ListNode[] lists) {
		for (ListNode node : lists) {
			if (node != null) {
				queue.offer(new Status(node.val, node));
			}
		}
		ListNode head = new ListNode(0);
		ListNode tail = head;
		while (!queue.isEmpty()) {
			Status f = queue.poll();
			tail.next = f.ptr;
			tail = tail.next;
			if (f.ptr.next != null) {
				queue.offer(new Status(f.ptr.next.val, f.ptr.next));
			}
		}
		return head.next;
	}
}

public class Num23 {
	public static void main(String[] args) {
		// 1 3,7
		ListNode n1 = new ListNode(1, new ListNode(3, new ListNode(7)));
		ListNode n2 = new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8))));
		Status s1 = new Status(1, n1);
		ListNode[] lists= {n1,n2};
		ListNode tmp = s1.mergeKLists(lists);
	}
}
