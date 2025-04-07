package com.sakthi.code.leetcode.easy1;

public class Base7 {
	/*
	 * Given an integer num, return a string of its base 7 representation.
	 * 
	 * Example 1:
	 * 
	 * Input: num = 100 
	 * Output: "202" 
	 * 
	 * Example 2:
	 * 
	 * Input: num = -7 Output: "-10"
	 */
	
	public static void main(String[] args) {
		Base7 obj=new Base7();
		System.out.println(obj.convertBase7(100));
		System.out.println(obj.convertBase7(-7));

	}
	
	public String convertBase7(int number) {
		String output="";
		String sign="";
		if(number==0) {
			return "0";
		}
		if(number<0) {
			sign="-";
		}
		number=Math.abs(number);
		while(number>0) {
			output=number%7+output;
			number=number/7;
		}
		output=sign+output;
		return output;
		
	}

}
