package com.lzu.edu.lk;
class ListNodea{
	int val;
	ListNodea next;

	ListNodea(int x) {
		val = x;
	}
}
public class Num0202_01 {
	//定义节点
	

	public static int kthToLast(ListNodea head, int k) {
		ListNodea p=head,p1=head;
		int i=0;
		while(i<=k&&p!=null) {//设置快指针的位置
			p=p.next;
			i++;
		}
		while(p!=null) {
			p=p.next;
			p1=p1.next;
		}
		return p1.val;
	}
	public static void main(String[] args) {
		kthToLast(new ListNodea(1), 1);
	}
}
