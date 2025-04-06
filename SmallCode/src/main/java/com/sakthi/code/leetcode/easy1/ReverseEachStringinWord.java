package com.sakthi.code.leetcode.easy1;

public class ReverseEachStringinWord {
	/*
	 * Given a string s, reverse the order of characters in each word within a
	 * sentence while still preserving whitespace and initial word order.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "Let's take LeetCode contest" Output:
	 * "s'teL ekat edoCteeL tsetnoc" Example 2:
	 * 
	 * Input: s = "Mr Ding" Output: "rM gniD"
	 */
	
	public static void main(String[] args) {
		ReverseEachStringinWord obj=new ReverseEachStringinWord();
		System.out.println(obj.reverseStringInWord("Let's take LeetCode contest"));
		System.out.println(obj.reverseStringInWord("Mr Ding"));

	}
	
	public String reverseStringInWord(String str) {
		String output="";
		String[] strs=str.split(" ");
		for(String s:strs) {
			output=output+" ";
			for(int i=s.length()-1;i>=0;i--) {
				output=output+String.valueOf(s.charAt(i));
			}
		}
		output=output.substring(1);
		return output;
	}

}
