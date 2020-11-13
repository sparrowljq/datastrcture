package com.lzu.edu.lk;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author junqiangliu
 *	最大队列改进
 */
public class MaxQueue_01 {
	Queue<Integer> queue=null;
	Deque<Integer> max_queue=null;
	public MaxQueue_01() {
		queue=new LinkedList<>();
		max_queue=new LinkedList<>();
    }
    
    public int max_value() {
    	if(max_queue.isEmpty()) return  -1;
    	return max_queue.peek();
    }
    
    public void push_back(int value) {
    	while(!max_queue.isEmpty()&&max_queue.getLast()<value) {
    		  max_queue.pollLast();
    	}
    	max_queue.add(value);
    	queue.add(value);
    }
    
    public int pop_front() {
    	if(queue.isEmpty()) return -1;
    	int res=queue.poll();
    	if(max_queue.getFirst()==res) max_queue.poll();
    	return res;
    }
    public static void main(String[] args) {
		MaxQueue_01 tmp=new MaxQueue_01();
		tmp.pop_front();
	}
}
