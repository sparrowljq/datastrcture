package com.lzu.edu.graph;

import java.util.LinkedList;
import java.util.Scanner;
/**
 * 
 * @author junqiangliu 图的测试类
 */
public class Test {
	public static boolean[] b=new boolean[100];

	// 图构建
	public static void creatGraph(Graph graph) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i <graph.numNodes; i++) {
			System.out.println("请输入第" + (i + 1) + "个顶点：");
			graph.vexs[i] = new Vex(in.next());
		}
		for (int i = 0; i <graph.numEdeges; i++) {
			System.out.println("请输入第" + (i + 1) + "条边的两端顶点坐标：");
			int p1 = in.nextInt();
			int p2 = in.nextInt();
			// 采用头插法插入节点
			Edege edg = new Edege(p2);
			edg.next = graph.vexs[p1].next;
			graph.vexs[p1].next = edg;
		}
	}

	// 深度优先遍历
	public static void DFS(Graph graph, int m) {
		Edege a = null;
		Test.b[m] = true;
		System.out.println("第" + m + "个顶点的信息：" + graph.vexs[m].data);
		a = graph.vexs[m].next;
		while (a != null) {
			if (!Test.b[a.id]) {
				DFS(graph,a.id);
				a = a.next;
			}
		}
	}

	// 深度优先遍历
	public static void DFSTraverse(Graph graph) {
		int i;
		for (i = 0; i < graph.numNodes; i++) {//初始化将所有的节点标记为未被访问
			Test.b[i] = false;
		}
		for (i = 0; i < graph.numNodes; i++) {
			if (!Test.b[i]) {
				DFS(graph, i);
			}
		}
	}

	// 图的广度优先遍历
	public static void BFSTraverse(Graph graph) {
		int i;
		Edege p;// 声明边指针
		LinkedList<Integer> queue = new LinkedList<>();
		for (i = 0; i < graph.numNodes; i++) {// 将所有的节点初始为未被访问
			Test.b[i] = false;
		}
		for (i = 0; i < graph.numNodes; i++) {
			if (!Test.b[i]) {
				Test.b[i] = true;
				System.out.println(graph.vexs[i].data);
				//将顶点节点的位置放入到队列中
				queue.addLast(i);
				while (queue.size() != 0) {
					int index = queue.removeFirst();
					//取出边节点
					p = graph.vexs[index].next;
					while (p != null) {
						if (!Test.b[p.id]) {
							Test.b[p.id] = true;
							System.out.println(graph.vexs[p.id].data);
							queue.addLast(p.id);
						}
						if (p.next == null) {
							p = null;
						} else {
							p = p.next;
						}
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		//5表示顶点数，8表示边数
		Graph g = new Graph(3,3);
		creatGraph(g);
		System.out.println("广度遍历结果：");
		BFSTraverse(g);
		System.out.println("深度遍历结果：");
		DFSTraverse(g);
		
	}
}
