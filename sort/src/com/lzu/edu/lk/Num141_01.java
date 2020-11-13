package com.lzu.edu.lk;

import java.util.HashSet;
import java.util.Set;

public class Num141_01 {
	public boolean hasCycle(ListNode head) {
		boolean flag=false;
		if(head==null) return flag;
		Set<ListNode> set=new HashSet<>();
		ListNode p=head;
		while(p!=null) {
			if(!set.contains(p)) {
				set.add(p);
			}else {
				flag=true;
				break;
			}
			p=p.next;
		}
		return flag;
	}
}
