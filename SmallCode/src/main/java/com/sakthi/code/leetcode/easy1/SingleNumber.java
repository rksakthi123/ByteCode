package com.sakthi.code.leetcode.easy1;

import java.util.Arrays;

public class SingleNumber {
	/*
	 * Given a non-empty array of integers nums, every element appears twice except
	 * for one. Find that single one.
	 * 
	 * You must implement a solution with a linear runtime complexity and use only
	 * constant extra space.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [2,2,1]
	 * 
	 * Output: 1
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [4,1,2,1,2,5,5]
	 * 
	 * Output: 4
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [1]
	 * 
	 * Output: 1
	 */
	
	public static void main(String[] args) {
		SingleNumber obj=new SingleNumber();
		System.out.println(obj.findSingleNumberCount(new int[] {2,2,1}));
		System.out.println(obj.findSingleNumberCount(new int[] {4,1,2,1,1,2,4,5}));
		System.out.println(obj.findSingleNumberCount(new int[] {1}));

	}
	
	public int findSingleNumberCount(int[] numbers) {
		Arrays.sort(numbers);
		int temp=Integer.MAX_VALUE;
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i-1]!=temp&&numbers[i]!=numbers[i-1]) {
				return numbers[i-1];
			}
			else {
				temp=numbers[i-1];
			}
		}
		return numbers[numbers.length-1];
	}

}
