package com.lzu.edu.lk;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Offer50 {
	public char firstUniqChar(String s) {
		Map<Character, Boolean> map = new HashMap<>();
		char[] arr = s.toCharArray();
		for (Character c : arr) {
			map.put(c, !map.containsKey(c));
		}
		char c = ' ';
		for (Character tmp : arr) {
			if (map.get(tmp)) {
				c = tmp;
				break;
			}
		}
		return c;
	}

	public char firstUniqChar1(String s) {
		Map<Character, Boolean> map = new LinkedHashMap<>();
		char[] arr = s.toCharArray();
		for (Character c : arr) {
			map.put(c, !map.containsKey(c));
		}
		for (Map.Entry<Character, Boolean> d : map.entrySet()) {
			if (d.getValue())
				return d.getKey();
		}
		return ' ';
	}
}
