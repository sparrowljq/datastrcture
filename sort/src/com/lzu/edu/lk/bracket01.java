package com.lzu.edu.lk;
/**
 * 
 * @author junqiangliu
 *	括号匹配简洁方法
 */

import java.util.Stack;

public class bracket01 {
	private Stack<Character> stack=new Stack<>();
	public boolean isValid(String s) {
		 boolean flag=false;
		 if(s.isEmpty()) {
			 return true;
		 }
		 for(char c:s.toCharArray()) {
			 if(c=='(') {
				 stack.push(')');
			 }
			 else if(c=='[') {
				 stack.push(']');
			 }
			 else if(c=='{') {
				 stack.push('}');
			 }
			 else if(stack.isEmpty()||c!=stack.pop()) {
				 return flag;
			 }
		 }
		 if(stack.isEmpty()) {
			 flag=true;
		 }
		 return flag;
	}
	 public static void main(String[] args) {
			bracket bbBracket=new bracket();
			boolean res=bbBracket.isValid("()");
			System.out.println(res);
			
	}
}
