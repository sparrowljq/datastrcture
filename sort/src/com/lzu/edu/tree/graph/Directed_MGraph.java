package com.lzu.edu.tree.graph;

import java.util.Scanner;

/**
 * 
 * @author junqiangliu
 *	构造有向图
 */
public class Directed_MGraph {
	public static void main(String[] args) {
		
	}
	public static MGraph directed_mgraph() {
		System.out.println("请输入节点数：");
		Scanner sc=new Scanner(System.in);
		int _numNodes=sc.nextInt();
		String[] vexs=new String[_numNodes];
		int[][] edgs=new int[_numNodes][_numNodes];
		System.out.println("请输入顶点名称：");
		for(int i=0;i<vexs.length;i++) {
			sc=new Scanner(System.in);
			vexs[i]=sc.nextLine();
		}
		for(int i=0;i<_numNodes;i++) {
			for(int j=0;j<_numNodes;j++) {
				double random=Math.random()*10;
				if(i==j) {
					edgs[i][j]=0;
				}else if(random<2) {
					edgs[i][j]=0;
				}else {
					edgs[i][j]=(int) random;
				}
			}
		}
		MGraph g=new MGraph();
		g.vexs=vexs;
		g.edgs=edgs;
		return g;
	}
}
