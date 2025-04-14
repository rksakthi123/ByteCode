package com.sakthi.code.leetcode.easy1;

public class PalindromNumber {

	public static void main(String[] args) {
		PalindromNumber obj=new PalindromNumber();
		System.out.println(obj.isPalindromNumber(10));

	}
	
	public boolean isPalindromNumber(int x) {
		if(x==revNumber(x)) {
			return true;
		}
		return false;
	}
	
	public int revNumber(int num) {
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
	}

}
