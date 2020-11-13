package com.lzu.edu.tree;
/**
 * 
 * @author junqiangliu
 *	树的孩子存储 树中找孩子节点很容易，但是寻找双亲节点需要遍历整个树
 */
public class Tree02 {
	//每个点的结构
	public class CTNode{
		public int data;
		//孩子的数量是通过树的度决定的
		public int child1;
		public int child2;
		public int child3;
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public int getChild1() {
			return child1;
		}
		public void setChild1(int child1) {
			this.child1 = child1;
		}
		public int getChild2() {
			return child2;
		}
		public void setChild2(int child2) {
			this.child2 = child2;
		}
		public int getChild3() {
			return child3;
		}
		public void setChild3(int child3) {
			this.child3 = child3;
		}
	}
	public class Tree{
		public CTNode nodes[];
		// r表示根的位置,n表示节点数
		public int r,n;
	}
}
