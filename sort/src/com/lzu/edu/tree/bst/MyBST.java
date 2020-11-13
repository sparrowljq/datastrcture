package com.lzu.edu.tree.bst;
/**
 * 
 * @author junqiangliu
 *	二叉搜索树
 */
public class MyBST<E extends Comparable<E>> {
	//创建树的节点
	private class Node{
		public E e;
		public Node left,right;
		public Node(E e) {
			super();
			this.e = e;
			left=null;
			right=null;
		}
	}
	private Node root;
	private int size;
	public MyBST() {
		root=null;
		size=0;
	}
	//二叉搜索树添加节点
	public void add(E e) {
		add(root, e);
	}
	private Node add(Node node,E e) {
		if(node==null) {
			size++;
			return new Node(e);
		}
		if(e.compareTo(node.e)<0) {
			node.left=add(node.left, e);
		}else if(e.compareTo(node.e)>0) {
			node.right=add(node.right, e);
		}
		return node;
	}
	//二叉搜素树查找
	public boolean contains(E e) {
		return contains(root,e);
	}
	private boolean contains(Node node, E e) {
		if(node==null) {
			return false;
		}
		if(e.compareTo(node.e)==0) {
			return true;
		}else if(e.compareTo(node.e)<0) {
			return contains(node.left, e);
		}else {
			return contains(node.right, e);
		}
	}
	//二叉搜索树删除节点
	public void remove(E e) {
		root=remove(root,e);
	}
	private Node remove(Node node,E e) {
		if(node==null) {
			return null;
		}
		if(e.compareTo(node.e)<0) {
			node.left=remove(node.left, e);
			return node;
		}else if(e.compareTo(node.e)>0) {
			node.right=remove(node.right, e);
			return node;
		}else {//找到待删除的元素了
			if(node.left==null) {
				Node rightNode=node.right;
				node.right=null;
				size--;
				return rightNode;
			}
			if(node.right==null) {
				Node leftNode=node.left;
				node.left=null;
				size--;
				return leftNode;
			}
			//找到最小的后继节点
			Node successor=minimum(node.right);
			successor.right=removeMin(node.right);
			successor.left=node.left;
			return successor;
		}
	}
	//删除最小节点
	private Node removeMin(Node node) {
		if(node.left==null) {
			Node rightNode=node.right;
			node.right=null;
			size--;
			return rightNode;
		}
		node.left=removeMin(node.left);
		return node;
	}
	//获取最小节点
	public Node minimum(Node node) {
		if(node.left==null) {
			return node;
		}
		return minimum(node.left);
	}
	
}
