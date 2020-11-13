package com.lzu.edu.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author junqiangliu
 *	构建二叉树
 */
public class TreeDemo {
	private CSNode root;
	//二叉树的结点
	class CSNode{
		public String data;
		public CSNode lchild,rchild;
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public CSNode getLchild() {
			return lchild;
		}
		public void setLchild(CSNode lchild) {
			this.lchild = lchild;
		}
		public CSNode getRchild() {
			return rchild;
		}
		public void setRchild(CSNode rchild) {
			this.rchild = rchild;
		}
	}
	public CSNode getRoot() {
		return root;
	}
	public void setRoot(CSNode root) {
		this.root = root;
	}
	public void createTree() {
			this.root=createTree(root);
	}
	//先序递归创建二叉树
	public CSNode createTree(CSNode node) {
		Scanner input=new Scanner(System.in);
		String str=input.next();
		if(str.trim().equals("#")) {
			return null;
		}else {
			node=new CSNode();
			node.setData(str);
			node.setLchild(createTree(node.getLchild()));
			node.setRchild(createTree(node.getRchild()));
			return node;
		}
		
	}
	//先序非递归创建二叉树
	public void createTree(String[] treeNodes) {
		Stack<CSNode> stack=new Stack<>();
		int index=0;
		CSNode node=root;
		while(index<treeNodes.length) {
			while(true) {
				if("#".equals(treeNodes[index])) {
					node=stack.pop();
//					if(node)
				}
			}
		}
	}
	//树的递归遍历
	//前序遍历(先根结点/左子树/右子树)
	public void preTraverse(CSNode tree) {
		if(tree!=null) {
			System.out.println(tree.getData());
			preTraverse(tree.getLchild());
			preTraverse(tree.getRchild());
		}
	}
	//中序遍历(左子树/先根结点/右子树)
	public void midTraverse(CSNode tree) {
		if(tree!=null) {
			preTraverse(tree.getLchild());
			System.out.println(tree.getData());
			preTraverse(tree.getRchild());
		}
	}
	//后序遍历(左子树/右子树/根结点)
	public void afterTraverse(CSNode tree) {
		if(tree!=null) {
			preTraverse(tree.getLchild());
			preTraverse(tree.getRchild());
			System.out.println(tree.getData());
		}
	}
	//二叉树的非递归遍历
	//前序遍历
	public void preOrderTraverse(CSNode tree) {
		Stack<CSNode> stack=new Stack<>();
		while(tree!=null||!stack.isEmpty()) {
			while(tree!=null) {
				System.out.println(tree.getData());
				stack.push(tree);
				tree=tree.getLchild();
			}
			if(!stack.isEmpty()) {
				tree = stack.pop();
				tree = tree.getRchild();
			}
		}
	}
	//中序遍历
	public void midOrderTraverse(CSNode tree) {
		Stack<CSNode> stack=new Stack<>();
		while(tree!=null||!stack.isEmpty()) {
			while(tree!=null) {
				stack.push(tree);
				tree=tree.getLchild();
			}
			if(!stack.isEmpty()) {
				tree=stack.pop();
				System.out.println(tree.getData());
				tree=tree.getRchild();
			}
		}
	}
	//后续遍历
	public void postOrderTraverse(CSNode tree) {
		int left=1;
		int right=2;
		Stack<CSNode> stack=new Stack<>();
		Stack<Integer> stack2=new Stack<>();
		while(tree!=null) {
			stack.push(tree);
			stack2.push(left);
			tree = tree.getLchild();
		}
		while(!stack.isEmpty()&&stack2.peek()==right) {
			stack2.pop();
			System.out.println(stack.pop().getData());
		}
		if(!stack.isEmpty()&&stack2.peek()==left) {
			stack2.pop();
			stack2.push(right);
			tree=stack.peek().getRchild();
		}
		
		
	}
	//二叉树的深度
	public int depth(CSNode tree) {
		int d,dl,dr;
		if(tree==null) {
			d=0;
		}else {
			dl=depth(tree.getLchild());
			dr=depth(tree.getRchild());
			d=1+(dl>dr?dl:dr);
		}
		return d;
	}
	//二叉树的层序遍历
	public void levelOrderTraveral(CSNode tree) {
		Queue<CSNode> queue=new LinkedList<>();
		queue.offer(tree);
		while(!queue.isEmpty()) {
			//队列先进先出
			CSNode treeNode = queue.poll();
			System.out.println(treeNode.getData());
			if(treeNode.getLchild()!=null) {
				queue.offer(treeNode.getLchild());
			}
			if(treeNode.getRchild()!=null) {
				queue.offer(treeNode.getRchild());
			}
		}
	}
	public static void main(String[] args) {
		TreeDemo td=new TreeDemo();
		td.createTree();
		td.levelOrderTraveral(td.getRoot());
	}
}
