package com.lzu.edu.lk;

public class Queries01 {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int sum=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]%2==0) {
				sum+=A[i];
			}
		}
		int[] answer = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			if(A[queries[i][1]]%2==0) {
				sum-=A[queries[i][1]];
			}
			A[queries[i][1]] = A[queries[i][1]] + queries[i][0];
			if(A[queries[i][1]]%2==0) {
				sum+=A[queries[i][1]];
			}
			answer[i] = sum;
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4 };
		int[][] queries = { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } };
		Queries01 queries2 = new Queries01();
		queries2.sumEvenAfterQueries(A, queries);
	}
}
