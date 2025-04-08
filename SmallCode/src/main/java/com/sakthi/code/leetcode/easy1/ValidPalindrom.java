package com.sakthi.code.leetcode.easy1;

public class ValidPalindrom {
	/*
	 * A phrase is a palindrome if, after converting all uppercase letters into
	 * lowercase letters and removing all non-alphanumeric characters, it reads the
	 * same forward and backward. Alphanumeric characters include letters and
	 * numbers.
	 * 
	 * Given a string s, return true if it is a palindrome, or false otherwise.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "A man, a plan, a canal: Panama" 
	 * Output: true 
	 * Explanation: "amanaplanacanalpanama" is a palindrome. Example 2:
	 * 
	 * Input: s = "race a car" 
	 * Output: false 
	 * Explanation: "raceacar" is not a  palindrome. 
	 * Example 3:
	 * 
	 * Input: s = " " 
	 * Output: true 
	 * Explanation: s is an empty string "" after
	 * removing non-alphanumeric characters. Since an empty string reads the same
	 * forward and backward, it is a palindrome.
	 * 
	 */
	public static void main(String[] args) {
		ValidPalindrom obj=new ValidPalindrom();
		System.out.println(obj.isValidPalindrom("A man, a plan, a canal: Panama"));
		System.out.println(obj.isValidPalindrom("race a car"));
		System.out.println(obj.isValidPalindrom(""));

	}
	
	public boolean isValidPalindrom(String str) {
		str=str.toLowerCase();
		for(int i=0,j=str.length()-1;i<=j;i++,j--) {
			if(!Character.isLetterOrDigit(str.charAt(i))) {
				j++;
				continue;
				
			}
			else if(!Character.isLetterOrDigit(str.charAt(j))) {
				i--;
				continue;
			}
			else if(str.charAt(i)!=str.charAt(j)) {
				return false;
				
			}
		}
		return true;
	}
	
	public boolean isAlphaNumeric(char c) {
		if(c>96&&c<122 || c>48&&c<57) {
			return true;
		}
		return false;
	}

}
