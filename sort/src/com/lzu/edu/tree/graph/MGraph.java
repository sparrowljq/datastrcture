package com.lzu.edu.tree.graph;
/**
 * 
 * @author junqiangliu
 *	图的邻接矩阵
 */
public class MGraph {
	private int numNodes;
	//存放节点的数组
	String[] vexs=new String[numNodes];
	//邻接矩阵，二维数组存储图的边或着弧
	int[][] edgs=new int[numNodes][numNodes];
}
