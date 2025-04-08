package com.sakthi.code.leetcode.easy1;

import java.util.Arrays;

public class MergeSortedArray {
	/*
	 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
	 * order, and two integers m and n, representing the number of elements in nums1
	 * and nums2 respectively.
	 * 
	 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
	 * 
	 * The final sorted array should not be returned by the function, but instead be
	 * stored inside the array nums1. To accommodate this, nums1 has a length of m +
	 * n, where the first m elements denote the elements that should be merged, and
	 * the last n elements are set to 0 and should be ignored. nums2 has a length of
	 * n.
	 * 
	 * Example 1:
	 * 
	 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 
	 * Output:
	 * [1,2,2,3,5,6] 
	 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
	 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
	 * Example 2:
	 * 
	 * Input: nums1 = [1], m = 1, nums2 = [], n = 0 
	 * Output: [1] 
	 * Explanation: The arrays we are merging are [1] and []. The result of the merge is [1]. 
	 * Example 3:
	 * 
	 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1 
	 * Output: [1] 
	 * Explanation: The arrays we are merging are [] and [1]. The result of the merge is [1]. Note
	 * that because m = 0, there are no elements in nums1. The 0 is only there to
	 * ensure the merge result can fit in nums1.
	 */
	
	public static void main(String[] args) {
		MergeSortedArray obj=new MergeSortedArray();
		int[] nums=obj.mergeSoretedArray(new int[]{1,2,3,0,0,0},3,new int[] {2,5,6},3);
		obj.print(nums);
		System.out.println("========================");
		nums=obj.mergeSoretedArray(new int[]{1},1,new int[] {},0);
		obj.print(nums);
		System.out.println("========================");
		nums=obj.mergeSoretedArray(new int[]{0},0,new int[] {1},1);
		obj.print(nums);
		System.out.println("========================");
	}
	
	public int[] mergeSoretedArray(int[] nums1,int m, int[] nums2, int n) {
		for(int i=m,j=0;j<n;i++,j++) {
			nums1[i]=nums2[j];
		}
		Arrays.sort(nums1);
		return nums1;
	}
	
	public void print(int[] nums) {
		for(int num:nums) {
			System.out.println(num);
		}
	}

}
