package com.sakthi.code.leetcode.easy1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsomorphicStrings {

	/*
	 * Given two strings s and t, determine if they are isomorphic.
	 * 
	 * Two strings s and t are isomorphic if the characters in s can be replaced to
	 * get t.
	 * 
	 * All occurrences of a character must be replaced with another character while
	 * preserving the order of characters. No two characters may map to the same
	 * character, but a character may map to itself.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "egg", t = "add"
	 * 
	 * Output: true
	 * 
	 * Explanation:
	 * 
	 * The strings s and t can be made identical by:
	 * 
	 * Mapping 'e' to 'a'. Mapping 'g' to 'd'. 
	 * Example 2:
	 * 
	 * Input: s = "foo", t = "bar"
	 * 
	 * Output: false
	 * 
	 * Explanation:
	 * 
	 * The strings s and t can not be made identical as 'o' needs to be mapped to
	 * both 'a' and 'r'.
	 * 
	 * Example 3:
	 * 
	 * Input: s = "paper", t = "title"
	 * 
	 * Output: true
	 */
	
	public static void main(String[] args) {
		IsomorphicStrings obj=new IsomorphicStrings();
		System.out.println(obj.checkIsomorphicString("paper", "title"));
		System.out.println(obj.checkIsomorphicString("foo", "bar"));
		System.out.println(obj.checkIsomorphicString("egg", "add"));
		System.out.println(obj.checkIsomorphicString("badc", "baba"));

	}
	
	public boolean checkIsomorphicString(String s,String t) {
		Map<Character, Character> map=new HashMap<Character,Character>();
		List<Character> list=new ArrayList<Character>();
		if(s.length()!=t.length()) {
			return false;
		}
		else {
			for(int i=0;i<s.length();i++) {
				if(!map.containsKey(s.charAt(i))&&!list.contains(t.charAt(i))) {
					map.put(s.charAt(i), t.charAt(i));
					list.add(t.charAt(i));
				}
				else {
					if(map.get(s.charAt(i))==null||t.charAt(i)!=map.get(s.charAt(i))) {
						return false;
					}
				}
			}
		}
		
		return true;
	}

}
