package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	快慢指针
 */
public class Num141 {
	public boolean hasCycle(ListNode head) {
		boolean flag=false;
		if(head==null) return false;
		ListNode p1=head,p2=head.next;
		while(true) {
			if(p1==p2) {
				flag=true;
				break;
			}
			if(p2!=null&&p2.next!=null) {
				p2=p2.next.next;
			}else {
				break;
			}
			if(p1!=null) {
				p1=p1.next;
			}
			
		}
		return flag;
	}
}
