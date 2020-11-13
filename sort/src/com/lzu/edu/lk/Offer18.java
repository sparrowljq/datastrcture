package com.lzu.edu.lk;

/**
 * 
 * @author junqiangliu 删除单链表节点
 */
public class Offer18 {
	public ListNode deleteNode(ListNode head, int val) {
		if(head==null) return null;
		if(head.val==val) return head.next;
		ListNode pre=null,p=head;
		while(p!=null) {
			if(p.val!=val) {
				pre=p;
				p=p.next;
			}else {
				pre.next=p.next;
				break;
			}
		}
		return head;
	}
}
