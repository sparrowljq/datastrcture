package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	最小栈
 */
public class MinStack {
	private Integer data[]=null;
	private int top=-1;
	public MinStack() {
		top=-1;
		data=new Integer[100];
	}
	public void push(int x) {
		if(top<data.length-1) {
			top++;
			data[top]=x;
		}
		
	}
	    
	    public void pop() {
	    	if(top!=-1) {
	    		data[top]=null;
	    		top--;
	    	}
	    }
	    
	    public int top() {
	    	Integer flag=null;
	    	if(top!=-1) {
	    		flag=data[top];
	    	}
	    	return flag;
	    }
	    
	    public int getMin() {
	    	Integer mindata=null;
	    	if(top>-1) {
	    		mindata=data[top];
		    	for(int i=0;i<=top;i++) {
		    		if(data[i]<mindata) {
		    			mindata=data[i];
		    		}
		    	}
	    	}
	    	return mindata;
	    }
	    public static void main(String[] args) {
	    	System.out.println("aaa");
			MinStack minStack=new MinStack();
			for (int i = 0; i < 100; i++) {
				minStack.push(i);
			}
			int min=minStack.getMin();
		}
}
