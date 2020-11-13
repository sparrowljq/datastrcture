package com.lzu.edu.tree;
/**
 * 
 * @author junqiangliu
 *	树的双亲表示 树中寻找双亲节点很容易，但是找子节点需要遍历整个树
 */
public class Tree01 {
	//每个节点的数据结构
	public class PTNode{
		//存放数据
		public int data;
		//存放父节点位置
		public int parent;
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public int getParent() {
			return parent;
		}
		public void setParent(int parent) {
			this.parent = parent;
		}
		
	}
	//树的结构
	class Tree{
		public PTNode nodes[];
		//根节点的位置和节点数
		public int r,n;
		public PTNode[] getNodes() {
			return nodes;
		}
		public void setNodes(PTNode[] nodes) {
			this.nodes = nodes;
		}
		public int getR() {
			return r;
		}
		public void setR(int r) {
			this.r = r;
		}
		public int getN() {
			return n;
		}
		public void setN(int n) {
			this.n = n;
		}
	}
}
