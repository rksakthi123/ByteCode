package com.sakthi.code.leetcode.easy2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		ValidParanthesis obj=new ValidParanthesis();
		System.out.println(obj.validParanthesis("(])"));

	}
	
	public boolean validParanthesis(String s) {
		Stack<Character> st=new Stack<Character>();
		Map<Character, Character> map=new HashMap<Character, Character>();
		map.put(']', '[');
		map.put('}', '{');
		map.put(')', '(');
		char[] chars=s.toCharArray();
		for(char c:chars) {
			if(st.isEmpty()) {
				st.push(c);
			}
			else {
				if(map.containsKey(c)) {
					if(st.peek()==map.get(c)) {
						st.pop();
					}
					else {
						st.push(c);
					}
				}
				else {
					st.push(c);
				}
			}
		}
		if(st.empty()) {
			return true;
		}
		return false;
	}

}
