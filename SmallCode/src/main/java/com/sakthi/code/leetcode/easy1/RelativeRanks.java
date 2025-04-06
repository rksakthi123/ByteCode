package com.sakthi.code.leetcode.easy1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {
	/*
	 * You are given an integer array score of size n, where score[i] is the score
	 * of the ith athlete in a competition. All the scores are guaranteed to be
	 * unique.
	 * 
	 * The athletes are placed based on their scores, where the 1st place athlete
	 * has the highest score, the 2nd place athlete has the 2nd highest score, and
	 * so on. The placement of each athlete determines their rank:
	 * 
	 * The 1st place athlete's rank is "Gold Medal". The 2nd place athlete's rank is
	 * "Silver Medal". The 3rd place athlete's rank is "Bronze Medal". For the 4th
	 * place to the nth place athlete, their rank is their placement number (i.e.,
	 * the xth place athlete's rank is "x"). Return an array answer of size n where
	 * answer[i] is the rank of the ith athlete.
	 * 
	 * Example 1:
	 * 
	 * Input: score = [5,4,3,2,1] Output:
	 * ["Gold Medal","Silver Medal","Bronze Medal","4","5"] Explanation: The
	 * placements are [1st, 2nd, 3rd, 4th, 5th]. Example 2:
	 * 
	 * Input: score = [10,3,8,9,4] Output:
	 * ["Gold Medal","5","Bronze Medal","Silver Medal","4"] Explanation: The
	 * placements are [1st, 5th, 3rd, 2nd, 4th].
	 */
	
	public static void main(String[] args) {
		RelativeRanks obj=new RelativeRanks();
		String[] rank=obj.getRelativeRanks(new int[] {5,4,3,2,1});
		obj.print(rank);
		System.out.println("==========================");
		rank=obj.getRelativeRanks(new int[] {10,3,8,9,4});
		obj.print(rank);

	}
	
	public String[] getRelativeRanks(int[] score) {
		String[] rank=new String[score.length];
		Map<Integer, String> map=new HashMap<Integer, String>();
		int[] copy=Arrays.copyOf(score, score.length);
		Arrays.sort(score);
		int index=1;
		for(int i=score.length-1;i>=0;i--) {
			if(index<=3) {
				if(index==1) {
					map.put(score[i], "Gold");
				}
				else if(index==2) {
					map.put(score[i], "Silver");
				}
				else if(index==3) {
					map.put(score[i], "Bronze");
				}
				
			}
			else {
			map.put(score[i], String.valueOf(index));
			}
			index++;
			
		}
		index=0;
		for(int c:copy) {
			rank[index]=map.get(c);
			index++;
		}
		return rank;
	}
	
	public void print(String rank[]) {
		for(String s:rank) {
			System.out.println(s);
		}
	}

}
