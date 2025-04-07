package com.sakthi.code.leetcode.easy1;

import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurance {
	/*
	 * Given two string arrays words1 and words2, return the number of strings that
	 * appear exactly once in each of the two arrays.
	 * 
	 * Example 1:
	 * 
	 * Input: words1 = ["leetcode","is","amazing","as","is"], 
	 * words2 =["amazing","leetcode","is"] 
	 * Output: 2 
	 * Explanation: - "leetcode" appears
	 * exactly once in each of the two arrays. We count this string.
	 *  - "amazing" appears exactly once in each of the two arrays. We count this string.
	 *   - "is" appears in each of the two arrays, but there are 2 occurrences of it in
	 * words1. We do not count this string. 
	 * - "as" appears once in words1, but does
	 * not appear in words2. We do not count this string. Thus, there are 2 strings
	 * that appear exactly once in each of the two arrays. 
	 * 
	 * Example 2:
	 * 
	 * Input: words1 = ["b","bb","bbb"], words2 = ["a","aa","aaa"] Output: 0
	 * Explanation: There are no strings that appear in each of the two arrays.
	 * Example 3:
	 * 
	 * Input: words1 = ["a","ab"], words2 = ["a","a","a","ab"] Output: 1
	 * Explanation: The only string that appears exactly once in each of the two
	 * arrays is "ab".
	 */

	public static void main(String[] args) {
		CountCommonWordsWithOneOccurance obj=new CountCommonWordsWithOneOccurance();
		System.out.println(obj.countCommonWordsWithOneOccurance(new String[] {"leetcode","is","amazing","as","is"},
				new String[] {"amazing","leetcode","is"}));
		System.out.println("=====================");
		System.out.println(obj.countCommonWordsWithOneOccurance(new String[] {"b","bb","bbb"},
				new String[] {"a","aa","aaa"}));
		System.out.println("=====================");
		System.out.println(obj.countCommonWordsWithOneOccurance(new String[] {"a","ab"},
				new String[] {"a","a","a","ab"}));

	}
	
	public int countCommonWordsWithOneOccurance(String[] words1,String[] words2) {
		Map<String, Integer> mapWords1=new HashMap<String, Integer>();
		Map<String, Integer> mapWords2=new HashMap<String, Integer>();
		for(String word1:words1) {
			if(!mapWords1.containsKey(word1)) {
				mapWords1.put(word1, 1);
			}
			else {
				mapWords1.put(word1, mapWords1.get(word1)+1);
			}
		}
		for(String word2:words2) {
			if(!mapWords2.containsKey(word2)) {
				mapWords2.put(word2, 1);
			}
			else {
				mapWords2.put(word2, mapWords2.get(word2)+1);
			}
		}
		int count=0;
		for(Map.Entry<String, Integer> map:mapWords2.entrySet()) {
			if(mapWords1.containsKey(map.getKey())&&map.getValue()==1) {
				count++;
			}
		}
		return count;
	}

}
