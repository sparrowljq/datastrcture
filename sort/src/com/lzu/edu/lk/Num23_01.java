package com.lzu.edu.lk;

import java.util.PriorityQueue;

/**
 * 
 * @author junqiangliu
 *	k链表合并改进
 */
class ListNode1 implements Comparable<ListNode1>{
	int val;
	ListNode1 next;
	
	public ListNode1() {
		super();
	}
	
	public ListNode1(int val) {
		super();
		this.val = val;
	}

	public ListNode1(int val, ListNode1 next) {
		super();
		this.val = val;
		this.next = next;
	}
	@Override
	public int compareTo(ListNode1 o) {
		// TODO Auto-generated method stub
		return this.val-o.val;
	}
	  public static ListNode1 mergeKLists(ListNode1[] lists) {
	       PriorityQueue<ListNode1> queue=new PriorityQueue<>();
	       for(ListNode1 node:lists) {
	    	   if(node!=null) {
	    		   queue.offer(node);
	    	   }
	       }
	       ListNode1 head=new ListNode1(0);
	       ListNode1 tail=head;
	       while(!queue.isEmpty()) {
	    	   ListNode1 t = queue.poll();
	    	   tail.next=t;
	    	   tail=tail.next;
	    	   if(t.next!=null) {
	    		   queue.offer(t.next);
	    	   }
	       }
	       return head.next;
	  }
}
public class Num23_01 {
	public static void main(String[] args) {
		ListNode1 n1=new ListNode1(1,new ListNode1(3, new ListNode1(7)));
		ListNode1 n2=new ListNode1(2,new ListNode1(4, new ListNode1(6)));
		ListNode1[] lists= {n1,n2};
		ListNode1 tmp = ListNode1.mergeKLists(lists);
	}
	
}
