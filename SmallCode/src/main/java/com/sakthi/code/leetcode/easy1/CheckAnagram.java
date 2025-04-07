package com.sakthi.code.leetcode.easy1;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		CheckAnagram obj=new CheckAnagram();
		String str1="abc";
		String str2="bca";
		System.out.println(obj.checkAnagram(str1, str2)); 
		str1="abc";
		str2="aac";
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
