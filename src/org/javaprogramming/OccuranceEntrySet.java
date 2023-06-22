package org.javaprogramming;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceEntrySet {
public static void main(String[] args) {
	String s = "josvik is is my josvik";
	String[] s1 = s.split(s);
	LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
	for(String s2:s1) {
		if(map.containsKey(s2)) {
			Integer count = map.get(s2);
			map.put(s2, count+1);
		}
		else {
			map.put(s2, 1);
		}
	}
	Set<Entry<String, Integer>> s3 = map.entrySet();
	for(Entry<String, Integer> s4:s3) {
//		if(s4.getValue()==2);
//		System.out.println(s4.getKey());
		if(s4.getKey().length()==5);
		System.out.println(s4.getKey());
	}
}
}
