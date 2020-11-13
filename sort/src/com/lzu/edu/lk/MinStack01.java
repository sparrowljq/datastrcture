package com.lzu.edu.lk;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author junqiangliu
 *	通过辅助栈的方法
 */


public class MinStack01 {
	//存放栈元素
	private List<Integer> stack=null;
	private List<Integer> min_stack=null;
	public MinStack01() {
		stack=new ArrayList<>();
		min_stack=new ArrayList<>();
	}
	public void push(int x) {
		//将元素依次入栈 辅助栈为降序栈
		stack.add(x);
		if(min_stack.isEmpty()) {
			min_stack.add(x);
		}else {
			//填加的元素小于最小栈中的元素
			if(min_stack.get(min_stack.size()-1)>=x) {
				min_stack.add(x);
			}
		}
		
	}
	    //弹出栈顶元素
	    public void pop() {
	    	if(stack.size()>0) {
	    		int tmp=stack.get(stack.size()-1);
	    		if(tmp==min_stack.get(min_stack.size()-1)) {
	    			min_stack.remove(min_stack.size()-1);
	    		}
	    		stack.remove(stack.size()-1);
	    	}
	    }
	    public int top() {
	    	return stack.get(stack.size()-1);
	    }
	    
	    public int getMin() {
	    	return min_stack.get(min_stack.size()-1);
	    }
	    public static void main(String[] args) {
			MinStack01 mStack01=new MinStack01();
			mStack01.push(512);
			mStack01.push(-1024);
			mStack01.push(-1024);
			mStack01.push(512);
			mStack01.pop();
			mStack01.getMin();
			mStack01.pop();
			mStack01.getMin();
			mStack01.pop();
			mStack01.getMin();
		}
}
