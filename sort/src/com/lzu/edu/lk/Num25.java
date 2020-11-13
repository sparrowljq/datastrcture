package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	offer25题 两个链表合并
 */

import java.util.PriorityQueue;

class Status implements Comparable<Status>{
	public int val;
	public ListNode ptr;
	
	public Status(int val) {
		super();
		this.val = val;
	}
	public Status(int val, ListNode ptr) {
		super();
		this.val = val;
		this.ptr = ptr;
	}
	@Override
	public int compareTo(Status o) {
		return this.val-o.val;
	}
	
}
public class Num25 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		PriorityQueue<Status> queue=new PriorityQueue<>();
		if(l1==null) return l2;
		queue.add(new Status(l1.val, l1.next));
		if(l2==null) return l1;
		queue.add(new Status(l2.val, l2));
		ListNode head=new ListNode();
		ListNode p=head;
		while(!queue.isEmpty()) {
			Status node = queue.poll();
			p.next=node.ptr;
			p=p.next;
			if(node.ptr.next!=null) {
				queue.add(new Status(node.ptr.next.val,node.ptr.next));
			}
		}
		return head.next;
    }
}
