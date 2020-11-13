package com.lzu.edu.lk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author junqiangliu
 *	
 */

public class N350 {
	  public int[] intersect(int[] nums1, int[] nums2) {
		  Map<Integer, Integer> tmp=new HashMap<>();
		  int[] res=new int[Math.min(nums1.length, nums2.length)];
		  for(int i=0;i<nums1.length;i++) {
			  if(tmp.containsKey(nums1[i])) {
				  tmp.put(nums1[i], tmp.get(nums1[i])+1);
			  }else {
				  tmp.put(nums1[i], 1);
			  }
		  }
		  int k=0;
		  for(int i=0;i<nums2.length;i++) {
			  if(tmp.containsKey(nums2[i])&&tmp.get(nums2[i])>0) {
				  res[k++]=nums2[i];
				  if(tmp.get(nums2[i])-1>0) {
					  tmp.put(nums2[i],tmp.get(nums2[i])-1);
				  }else {
					  tmp.remove(nums2[i]);
				  }
				  
			  }
		  }
		  return Arrays.copyOfRange(res, 0, k);

	   }
	  public static void main(String[] args) {
		  int[] nums1 = {1,2,2,1}, nums2 = {2,2};
		  
	}
	  
}
