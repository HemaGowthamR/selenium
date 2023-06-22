package org.javaprogramming;

import java.util.LinkedHashMap;

public class OccuranceOfWords {
public static void main(String[] args) {
	String s ="aishu is is a girl girl";
	String[] s1 = s.split(" ");
	LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
	for (String s2 : s1) {
		if (map.containsKey(s2)) {
			Integer count = map.get(s2);
			map.put(s2, count+1);
		} else {
			map.put(s2, 1);
		}
	}
	System.out.println(map);
}
}
