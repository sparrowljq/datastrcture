package com.lzu.edu.lk;

import java.util.HashMap;
import java.util.Map;

public class Queries {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		//将将A中是偶数的位置放入到hashmap中
		Map<Integer,Integer> tmp=new HashMap<>();
		//初始化map
		for(int i=0;i<A.length;i++) {
			if(A[i]%2==0) {
				tmp.put(i, A[i]);
			}
		}
		int[] answer = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			A[queries[i][1]] = A[queries[i][1]] + queries[i][0];
			//如果偶数则看map中是否存有该位置的值 如果有则更新值 否则添加
			if(A[queries[i][1]]%2==0) {
				tmp.put(queries[i][1],A[queries[i][1]]);
			}else {
				if(tmp.containsKey(queries[i][1])) {
					tmp.remove(queries[i][1]);
				}
			}
			
			answer[i] = sum(tmp);
		}
		return answer;
	}

	public int sum(Map<Integer, Integer> map) {
		int sum=0;
		for(Integer val:map.values()) {
			sum+=val;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4 };
		int[][] queries = { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } };
		Queries queries2 = new Queries();
		queries2.sumEvenAfterQueries(A, queries);
	}
}
