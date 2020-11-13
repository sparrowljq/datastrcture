package com.lzu.edu.lk;

import java.util.Stack;

public class Offer06 {
	public static int[] reversePrint(ListNode head) {
		Stack<Integer> stack=new Stack<>();
		ListNode p=head;
		while(p!=null) {
			stack.add(p.val);
			p=p.next;
		}
		int[] res=new int[stack.size()];
		int count=0;
		while(!stack.isEmpty()) {
			res[count++]=stack.pop();
		}
		return res;
	}
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		l1.next=l2;
		l2.next=l3;
		reversePrint(l1);
				
	}
}
