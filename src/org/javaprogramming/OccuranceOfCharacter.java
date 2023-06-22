package org.javaprogramming;

import java.util.LinkedHashMap;

public class OccuranceOfCharacter {
	
	public static void main(String[] args) {
		String s = "wwcdd";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		          //1      //2          //5
		for (int i = 0; i < s.length(); i++) {
			     //3
			char c = s.charAt(i);
			//4.1
			if (map.containsKey(c)) {
				//4.1.1
				Integer count = map.get(c);
				//4.1.2
				map.put(c, count+1);
				}
			//4.2
			else {
				map.put(c, 1);
				}
			}
		System.out.println(map);
		}
	}
