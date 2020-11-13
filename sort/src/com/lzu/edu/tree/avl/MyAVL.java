package com.lzu.edu.tree.avl;

import com.lzu.edu.lk.num475;

/**
 * 
 * @author junqiangliu
 * 
 */
public class MyAVL<K extends Comparable<K>, V> {
	private class Node {
		public K key;
		public V val;
		public Node left, right;
		// 每个节点都有高度，初始值为1
		public int height;

		public Node(K key, V val) {
			this.key = key;
			this.val = val;
			right = null;
			left = null;
			height = 1;
		}
	}

	private Node root;
	private int size;

	public MyAVL() {
		root = null;
		size = 0;
	}
	//获得AVL树的高度
	private int getHeight(Node node) {
		if (node == null) {
			return 0;
		}
		return node.height;
	}

	// 获取平衡高度差
	private int getBalanceFactor(Node node) {
		if (node == null) {
			return 0;
		}
		return getHeight(node.left) - getHeight(node.right);
	}

	// 右旋
	// 对节点y进行向右旋转操作，返回旋转后新的根节点x
//       y                              x
//      / \                           /   \
//     x   T4     向右旋转 (y)        z     y
//    / \       - - - - - - - ->    / \   / \
//   z   T3                       T1  T2 T3 T4
//  / \
// T1   T2
	private Node rightRotate(Node y) {
		Node x = y.left;
		Node T3 = x.right;
		x.right = y;
		y.left = T3;
		y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
		x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
		return x;
	}

	// 左旋
	// 对节点y进行向左旋转操作，返回旋转后新的根节点x
	// 对节点y进行向左旋转操作，返回旋转后新的根节点x
//     y                             x
//    / \                          /   \
//  T1   x      向左旋转 (y)       y     z
//      / \   - - - - - - - ->   / \   / \
//     T2  z                     T1 T2 T3 T4
//        / \
//        T3 T4
	private Node leftRotate(Node y) {
		Node x = y.right;
		Node T2 = x.left;
		x.left = y;
		y.right = T2;
		y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
		x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
		return x;
	}

	// 添加元素
	public void add(K key, V val) {
		root = add(root, key, val);
	}

	// 插入过程通过LL,RR,LR,RL来维持树的平衡性
	private Node add(Node node, K key, V val) {
		if (node == null) {
			size++;
			return new Node(key, val);
		}
		if (key.compareTo(node.key) < 0) {
			node.left = add(node.left, key, val);
		} else if (key.compareTo(node.key) > 0) {
			node.right = add(node.right, key, val);
		} else {
			node.val = val;
		}
		node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
		int blc = getBalanceFactor(node);
		// RR
		if (blc > 1 && getBalanceFactor(node.left) >= 0) {
			return rightRotate(node);
		}
		// LL
		if (blc < -1 && getBalanceFactor(node.right) <= 0) {
			return leftRotate(node);
		}
		// LR
		if (blc > 1 && getBalanceFactor(node.left) < 0) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		// RL
		if (blc < -1 && getBalanceFactor(node.right) > 0) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}
		return node;
	}

	// 查找元素
	private Node getNode(Node node, K key) {
		if (node == null) {
			return null;
		}
		if (key.equals(node.key)) {
			return node;
		} else if (key.compareTo(node.key) < 0) {
			return getNode(node.left, key);
		} else {
			return getNode(node.right, key);
		}
	}

	// 获取最小元素
	private Node minimum(Node node) {
		if (node.left == null) {
			return node;
		}
		return minimum(node.left);
	}

	// 获取最大元素
	private Node maxmum(Node node) {
		if (node.right == null) {
			return node;
		}
		return node.right;
	}

	// 删除元素
	public Node remove(K key) {
		// 获取要删除的节点
		Node node = getNode(root, key);
		if (node != null) {
			return remove(root, key);
		}
		return null;
	}

	private Node remove(Node node, K key) {
		if (node == null) {
			return null;
		}
		Node retNode;
		if (key.compareTo(node.key) < 0) {
			node.left = remove(node.left, key);
			retNode = node;
		} else if (key.compareTo(node.key) > 0) {
			node.right = remove(node.right, key);
			retNode = node;
		} else {
			// 待删除节点左子树为空
			if (node.left == null) {
				Node rightNode = node.right;
				node.right = null;
				size--;
				return rightNode;
			} else if (node.right == null) {
				Node leftnode = node.left;
				node.left = null;
				size--;
				return leftnode;
			} else {
				Node successor = minimum(node.right);
				successor.right = remove(node.right, successor.key);
				successor.left = node.left;
				node.left = node.right = null;
				retNode = successor;
			}
		}
		if (retNode == null) {
			return null;
		}
		retNode.height = 1 + Math.max(getHeight(retNode.left), getHeight(retNode.right));
		int blc = getBalanceFactor(retNode);
		// RR
		if (blc > 1 && getBalanceFactor(retNode.left) >= 0) {
			return rightRotate(retNode);
		}
		// LL
		if (blc < -1 && getBalanceFactor(retNode.right) <= 0) {
			return leftRotate(retNode);
		}
		// LR
		if (blc > 1 && getBalanceFactor(retNode.left) < 0) {
			retNode.left = leftRotate(retNode.left);
			return rightRotate(retNode);
		}
		// RL
		if (blc < -1 && getBalanceFactor(retNode.right) > 0) {
			retNode.right = rightRotate(retNode.right);
			return leftRotate(retNode);
		}
		return retNode;
	}

}
