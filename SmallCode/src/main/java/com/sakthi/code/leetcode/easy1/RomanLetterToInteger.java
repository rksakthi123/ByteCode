package com.sakthi.code.leetcode.easy1;

import java.util.HashMap;
import java.util.Map;

public class RomanLetterToInteger {

	public static void main(String[] args) {
		RomanLetterToInteger obj=new RomanLetterToInteger();
		System.out.println(obj.romanLetterToInteger("XIV"));
		System.out.println(obj.romanLetterToInteger("LVIII"));
		System.out.println(obj.romanLetterToInteger("MCMXCIV"));

	}
	
	public int romanLetterToInteger(String romanLetter) {
		Map<String, Integer> mapRomanLetterToInteger=new HashMap<String, Integer>();
		mapRomanLetterToInteger.put("I",1);
		mapRomanLetterToInteger.put("V",5);
		mapRomanLetterToInteger.put("X",10);
		mapRomanLetterToInteger.put("L",50);
		mapRomanLetterToInteger.put("C",100);
		mapRomanLetterToInteger.put("D",500);
		mapRomanLetterToInteger.put("M",1000);
		int output=0;
		for(int i=1;i<romanLetter.length();i++) {
			if(mapRomanLetterToInteger.get(String.valueOf(romanLetter.charAt(i)))>
			mapRomanLetterToInteger.get(String.valueOf(romanLetter.charAt(i-1)))) {
				output=output-mapRomanLetterToInteger.get(String.valueOf(romanLetter.charAt(i-1)));
			}
			else {
				output=output+mapRomanLetterToInteger.get(String.valueOf(romanLetter.charAt(i-1)));
			}
			
		}
		output=output+mapRomanLetterToInteger.get(String.valueOf(romanLetter.charAt(romanLetter.length()-1)));
		return output;
		
	}

}
