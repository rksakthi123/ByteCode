package com.sakthi.code.leetcode.easy1;

public class DetectCapital {
	/*
	 * We define the usage of capitals in a word to be right when one of the
	 * following cases holds:
	 * 
	 * All letters in this word are capitals, like "USA". All letters in this word
	 * are not capitals, like "leetcode". Only the first letter in this word is
	 * capital, like "Google". Given a string word, return true if the usage of
	 * capitals in it is right.
	 * 
	 * Example 1:
	 * 
	 * Input: word = "USA" Output: true Example 2:
	 * 
	 * Input: word = "FlaG" Output: false
	 */
	
	public static void main(String[] args) {
		DetectCapital obj=new DetectCapital();
		System.out.println(obj.detectCapital("USA"));
		System.out.println(obj.detectCapital("leetcode"));
		System.out.println(obj.detectCapital("Google"));
		System.out.println(obj.detectCapital("FlaG"));

	}
	
	public boolean detectCapital(String str) {
		String w=str.substring(0,1);
		String ww=str.substring(1);
		if(str.equals(str.toUpperCase())||
				str.equals(str.toLowerCase())) {
			return true;
		}
		else if(w.equals(w.toUpperCase())&&ww.equals(ww.toLowerCase())) {
			return true;
		}
		return false;
	}
	
	

}
