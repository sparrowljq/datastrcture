package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu 复制复杂链表
 */
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class Offer35 {
	public static Node copyRandomList(Node head) {
		Node res=new Node(0);
		Node p=res;
		while(head!=null) {
			p=head;
			p.random=head.random;
			head=head.next;
			p=p.next;
		}
		return res;
	}
	public static void main(String[] args) {
		Node n1=new Node(1);
		Node n2=new Node(2);
		n1.random=n2;
		n1.next=n2;
		n2.random=n2;
		n2.next=null;
		Node tmp = copyRandomList(n1);
		
	}
}
