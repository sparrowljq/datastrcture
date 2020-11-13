package com.lzu.edu.lk;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author junqiangliu
 *	括号匹配
 */
public class bracket {
	//基本思想是 将遇到做括号入栈，右括号出栈
	public List<Character> stack=new ArrayList<Character>();
	 public boolean isValid(String s) {
		 boolean flag=false;
		 if(s.isEmpty()) {
			 return true;
		 }
		 char[] arr = s.toCharArray();
		 if(arr[0]==')'||arr[0]==']'||arr[0]=='}') {
			 return flag;
		 }
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]=='('||arr[i]=='['||arr[i]=='{') {
				 stack.add(arr[i]);
			 }
			 char tmp=' ';
			 if(stack.size()>0) {
				 tmp=stack.get(stack.size()-1);
			 }
			 if(arr[i]==')') {
				 if(tmp=='('&& stack.size()>0) {
					 stack.remove(stack.size()-1);
				 }else {
					 return flag;
				 }
				 
			 }
			 if(arr[i]==']') {
				 if(tmp=='['&& stack.size()>0) {
					 stack.remove(stack.size()-1);
				 }else {
					 return flag;
				 }
				
			 }
			 if(arr[i]=='}') {
				 if(tmp=='{'&&stack.size()>0) {
					 stack.remove(stack.size()-1);
				 }else {
					 return flag;
				 }
				
			 }
		 }
		 if(stack.isEmpty()) {
			 flag=true;
		 }
		 return flag;
	 }
	 public static void main(String[] args) {
		bracket bbBracket=new bracket();
		boolean res=bbBracket.isValid("[])");
		System.out.println(res);
		
	}
}
