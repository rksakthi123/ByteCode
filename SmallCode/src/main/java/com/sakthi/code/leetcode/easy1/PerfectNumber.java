package com.sakthi.code.leetcode.easy1;

public class PerfectNumber {
	/*
	 * A perfect number is a positive integer that is equal to the sum of its
	 * positive divisors, excluding the number itself. A divisor of an integer x is
	 * an integer that can divide x evenly.
	 * 
	 * Given an integer n, return true if n is a perfect number, otherwise return
	 * false.
	 * 
	 * Example 1:
	 * 
	 * Input: num = 28 
	 * Output: true 
	 * Explanation: 28 = 1 + 2 + 4 + 7 + 14 1, 2, 4, 7,
	 * and 14 are all divisors of 28. 
	 * Example 2:
	 * 
	 * Input: num = 7 
	 * Output: false
	 */
	
	public static void main(String[] args) {
		PerfectNumber obj=new PerfectNumber();
		System.out.println(obj.checkPerfectNumber(28));
		System.out.println(obj.checkPerfectNumber(7));

	}
	
	public boolean checkPerfectNumber(int number) {
		int sum=0;
		int n=1;
		while(n<=number/2) {
			if(number%n==0) {
				sum=sum+n;
			}
			n++;
		}
		return sum==number;
	}

}
