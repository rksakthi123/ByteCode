package com.sakthi.code.leetcode.easy1;

public class RotateString {
	/*
	 * Given two strings s and goal, return true if and only if s can become goal
	 * after some number of shifts on s.
	 * 
	 * A shift on s consists of moving the leftmost character of s to the rightmost
	 * position.
	 * 
	 * For example, if s = "abcde", then it will be "bcdea" after one shift.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "abcde", goal = "cdeab" Output: true Example 2:
	 * 
	 * Input: s = "abcde", goal = "abced" Output: false
	 */
	
	public static void main(String[] args) {
		RotateString obj=new RotateString();
		System.out.println(obj.isRotatedString("abcde", "cdeab"));
		System.out.println(obj.isRotatedString("abcde", "abced"));

	}
	
	public boolean isRotatedString(String s,String goal) {
		if(s.concat(s).contains(goal)) {
			return true;
		}
		return false;
	}

}
