package com.lzu.edu.graph;

//顶点
class Vex{
	public String data;
	public Edege next;
	
	public Vex() {}

	public Vex(String data) {
		this.data = data;
		this.next =null;
	}
	
}
//边
class Edege{
	public int id;
	public Edege next;
	public Edege() {}
	public Edege(int id) {
		super();
		this.id = id;
		this.next =null;
	}
	
}
//图
public class Graph {
	public int numNodes;
	public int numEdeges;
	Vex[] vexs=null;
	
	public Graph() {}
	
	public Graph(int numNodes, int numEdeges) {
		super();
		this.numNodes = numNodes;
		this.numEdeges = numEdeges;
		vexs=new Vex[numNodes];
	}
}

