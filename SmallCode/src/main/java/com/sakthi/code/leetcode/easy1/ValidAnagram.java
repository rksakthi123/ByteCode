package com.sakthi.code.leetcode.easy1;

import java.util.Arrays;

public class ValidAnagram {
	/*
	 * Given two strings s and t, return true if t is an anagram of s, and false
	 * otherwise.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "anagram", t = "nagaram"
	 * 
	 * Output: true
	 * 
	 * Example 2:
	 * 
	 * Input: s = "rat", t = "car"
	 * 
	 * Output: false
	 */
	
	public static void main(String[] args) {
		ValidAnagram obj=new ValidAnagram();
		String str1="abc";
		String str2="bca";
		System.out.println(obj.checkAnagram(str1, str2)); 
		str1="abc";
		str2="aac";
		System.out.println(obj.checkAnagram(str1, str2)); 
		str1="anagram";
		str2="nagaram";
		System.out.println(obj.checkAnagram(str1, str2)); 

	}
	
	public boolean checkAnagram(String str1,String str2) {
		char[] charArray1=str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if(Arrays.equals(charArray1, charArray2)) {
			return true;
		}
		return false;
	}

}
