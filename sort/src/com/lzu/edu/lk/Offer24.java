package com.lzu.edu.lk;

import java.util.Stack;

/**
 * 
 * @author junqiangliu 链表反转
 */
public class Offer24 {
	public static ListNode reverseList(ListNode head) {
		Stack<ListNode> stack=new Stack<>();
		while(head!=null) {
			stack.add(head);
			head=head.next;
		}
		if(stack.isEmpty()) return null;
		ListNode res=stack.pop();
		ListNode p=res;
		while(!stack.isEmpty()) {
			res.next=stack.pop();
			res=res.next;
		}
		res.next=null;//如果不置空则会造成循环
		return p;
	}
	//用双指针做
	public static ListNode reverseList1(ListNode head) {
		ListNode cur,pre;
		cur=null;
		if(head==null) return head;
		pre=head;
		while(pre!=null) {
			ListNode t=pre.next;
			pre.next=cur;
			cur=pre;
			pre=t;
		}
		return cur;
	}
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(4);
		ListNode l5=new ListNode(5);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		ListNode tmp = reverseList1(l1);
	}
}
