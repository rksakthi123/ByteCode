package com.sakthi.code.leetcode.medium1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		GroupAnagrams obj=new GroupAnagrams();
		String[] strs= {"eat","tea","tan","ate","nat","bat"};
		System.out.println(obj.groupAnagrams(strs));
		String[] strs1= {"a"};
		System.out.println(obj.groupAnagrams(strs1));

	}
	
	public List<List<String>> groupAnagrams(String[] strs){
		Map<String, List<String>> mapGroupAnagrams=new HashMap<String, List<String>>();
		for(String str:strs){
			char[] charArray=str.toCharArray();
			Arrays.sort(charArray);
			String tempString=String.valueOf(charArray);
			if(!mapGroupAnagrams.containsKey(tempString)) {
				List<String> listAnagrams=new ArrayList<String>();
				listAnagrams.add(str);
				mapGroupAnagrams.put(tempString, listAnagrams);
			}
			else {
				List<String> listAnagrams=mapGroupAnagrams.get(tempString);
				listAnagrams.add(str);
				mapGroupAnagrams.put(tempString, listAnagrams);
			}
		}
		List<List<String>> listOfAnagrams=new ArrayList<List<String>>(mapGroupAnagrams.values());
		return listOfAnagrams;
	}

}
