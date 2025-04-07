package com.sakthi.code.leetcode.easy1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HappyNumber {
	/*
	 * Write an algorithm to determine if a number n is happy.
	 * 
	 * A happy number is a number defined by the following process:
	 * 
	 * Starting with any positive integer, replace the number by the sum of the
	 * squares of its digits. Repeat the process until the number equals 1 (where it
	 * will stay), or it loops endlessly in a cycle which does not include 1. Those
	 * numbers for which this process ends in 1 are happy. Return true if n is a
	 * happy number, and false if not.
	 * 
	 * Example 1:
	 * 
	 * Input: n = 19 
	 * Output: true 
	 * Explanation: 1^2 + 9^2 = 82 8^2 + 2^2 = 68 6^2 + 8^2 =100 1^2 + 0^2 + 0^2 = 1 
	 * Example 2:
	 * 
	 * Input: n = 2 Output: false
	 */
	
	public static void main(String[] args) {
		HappyNumber obj=new HappyNumber();
		System.out.println(obj.isHappyNumber(19));
		System.out.println(obj.isHappyNumber(2));

	}
	
	public boolean isHappyNumber(int number) {
		List<Integer> list=new ArrayList<Integer>();
		while(number>1) {
			int prev=number;
			if(list.contains(number)) {
				return false;
			}
			int n=number;
			number=0;
			while(n>0) {
				number=number+(n%10)*(n%10);
				n=n/10;
				
			}
			list.add(prev);
		}
		return true;
	}

}
