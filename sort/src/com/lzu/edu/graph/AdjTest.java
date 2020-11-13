package com.lzu.edu.graph;

/**
 * 
 * @author junqiangliu 图的邻接矩阵
 */
class AdjGraph {
	// 节点数
	private Integer numNodes;
	// 存放顶点值
	private String[] vexs = null;
	private boolean[] visited=null;
	// 存放边
	private int[][] edgs = null;

	public AdjGraph() {
		super();
	}

	public AdjGraph(Integer numNodes, String[] vexs, int[][] edgs) {
		super();
		this.numNodes = numNodes;
		this.vexs = vexs;
		this.edgs = edgs;
		visited=new boolean[numNodes];
		for(int i=0;i<numNodes;i++) {
			visited[i]=false;
		}
	}

}
//测试类
public class AdjTest {
	
}
