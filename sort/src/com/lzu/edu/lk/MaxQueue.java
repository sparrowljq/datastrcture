package com.lzu.edu.lk;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author junqiangliu
 *	最大队列
 */
public class MaxQueue {
	Queue<Integer> queue=null;
	public MaxQueue() {
		queue=new LinkedList<Integer>();
    }
    
    public int max_value() {
    	if(queue.isEmpty()) return -1;
    	int max=0;
    	for(int item:queue) {
    		if(item>max) {
    			max=item;
    		}
    	}
    	return max;
    }
    
    public void push_back(int value) {
    	queue.add(value);
    }
    
    public int pop_front() {
    	if(queue.isEmpty()) return -1;
    	int res=queue.poll();
    	return res;
    }
    public static void main(String[] args) {
		MaxQueue tmp=new MaxQueue();
		tmp.pop_front();
	}
}
