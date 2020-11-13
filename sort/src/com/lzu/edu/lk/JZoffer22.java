package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	返回倒数第k个节点
 */
public class JZoffer22 {
	public static ListNode getKthFromEnd(ListNode head, int k) {
		if(head==null) return null;
		ListNode p1=head,p2=head;
		while(k>0&&p1!=null) {
			p1=p1.next;
			k--;
		}
		while(p1!=null) {
			p1=p1.next;
			p2=p2.next;
		}
		return p2;
    }
	public static void main(String[] args) {
		ListNode ll=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
		getKthFromEnd(ll, 2);
	}
}
