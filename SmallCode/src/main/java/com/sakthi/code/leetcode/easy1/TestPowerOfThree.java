package com.sakthi.code.leetcode.easy1;

public class TestPowerOfThree {

	public static void main(String[] args) {
		TestPowerOfThree obj=new TestPowerOfThree();
		System.out.println(obj.checkPowerOfThree(27));
		System.out.println(obj.checkPowerOfThree(9));
		System.out.println(obj.checkPowerOfThree(8));

	}
	
	public boolean checkPowerOfThree(int num) {
		while(num%3==0) {
			num=num/3;
		}
		return num==1;
	}

}
