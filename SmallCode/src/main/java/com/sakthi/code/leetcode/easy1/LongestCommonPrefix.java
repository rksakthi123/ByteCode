package com.sakthi.code.leetcode.easy1;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix obj=new LongestCommonPrefix();
		System.out.println(obj.longestCommonPrefix(new String[] {"cir","car"}));

	}
	
	public String longestCommonPrefix(String[] strs) {
		 String common="";
			String temp="";
			for(int i=0;i<strs[0].length();i++) {
				for(int j=1;j<strs.length;j++) {
					if(i<strs[j].length()) {
						if(strs[0].charAt(i)!=strs[j].charAt(i)) {
							return temp;
						}
					}
	                else{
	                   return temp; 
	                }
				}
				temp=temp+strs[0].charAt(i);
				if(i==strs[0].length()-1) {
					common=temp;
				}
			}
			return common;
	}

}
