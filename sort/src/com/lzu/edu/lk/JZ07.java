package com.lzu.edu.lk;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author junqiangliu
 *	根据前序和中序遍历的结果构建二叉树
 */
public class JZ07 {
	public class TreeNode{
		private int val;
		private TreeNode left;
		private TreeNode right;
		public TreeNode(int x) {
			val=x;
		}
	}
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder==null||preorder.length==0) {
			return null;
		}
		Map<Integer, Integer> indexMap=new HashMap<>();
		int length=preorder.length;
		for(int i=0;i<length;i++) {
			indexMap.put(inorder[i], i);
		}
		TreeNode root=buildTree(preorder,0,length-1,inorder,0,length-1,indexMap);
		return root;
	}
	public TreeNode buildTree(int[] preorder,int preorderStart,int preorderend,
			int[] inorder,int inorderstart,int inorderend,Map<Integer, Integer> indexMap) {
		if(preorderStart>preorderend) {
			return null;
		}
		//前序遍历的第一个值是根结点
		int rootVal=preorder[preorderStart];
		TreeNode root=new TreeNode(rootVal);
		if(preorderStart==preorderend) {
			return root;
		}else {
			int rootIndex=indexMap.get(rootVal);
			int leftNodes=rootIndex-inorderstart;//左子树结点的个数
			int rightNodes=inorderend-rootIndex;//右子树结点的个数
			TreeNode leftSubtree=buildTree(preorder,preorderStart+1,preorderStart+leftNodes,inorder,inorderstart,rootIndex-1,indexMap);
			TreeNode rightSubtree=buildTree(preorder, preorderend-rightNodes+1,preorderend,inorder,rootIndex+1,inorderend,indexMap);
			root.left=leftSubtree;
			root.right=rightSubtree;
			return root;
		}
	}
}
