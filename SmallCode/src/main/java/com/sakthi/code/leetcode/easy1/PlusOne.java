package com.sakthi.code.leetcode.easy1;

/*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].*/

public class PlusOne {

	public static void main(String[] args) {
		PlusOne obj=new PlusOne();
		int[] numbers=obj.plusOne(new int[] {1,2,3});
		obj.print(numbers);
		System.out.println("==============");
		numbers=obj.plusOne(new int[] {4,3,2,1});
		obj.print(numbers);
		System.out.println("==============");
		numbers=obj.plusOne(new int[] {9});
		obj.print(numbers);
		System.out.println("==============");
		numbers=obj.plusOne(new int[] {1,9,9});
		obj.print(numbers);
		

	}
	
	public int[] plusOne(int[] numbers) {
		
		for(int i=numbers.length-1;i>=0;i--) {
			if(numbers[i]<9) {
				numbers[i]++;
				return numbers;
			}
			else {
				numbers[i]=0;
			}
		}
		numbers=new int[numbers.length+1];
		numbers[0]=1;
		return numbers;
	}
	public void print(int[] numbers) {
		for(int num:numbers) {
			System.out.println(num);
		}
	}

}
