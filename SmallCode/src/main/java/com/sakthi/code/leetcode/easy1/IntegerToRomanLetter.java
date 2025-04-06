package com.sakthi.code.leetcode.easy1;

public class IntegerToRomanLetter {

	public static void main(String[] args) {
		IntegerToRomanLetter obj=new IntegerToRomanLetter();
		System.out.println(obj.integerToRomanLetter(4));
		System.out.println(obj.integerToRomanLetter(3749));
		System.out.println(obj.integerToRomanLetter(58));
		System.out.println(obj.integerToRomanLetter(1994));

	}
	public String integerToRomanLetter(int number) {
		String romanLetter="";
		int[] numbers= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] romanLetters= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		for(int i=0;i<numbers.length;i++) {
			while(number>=numbers[i]) {
				romanLetter=romanLetter+romanLetters[i];
				number=number-numbers[i];
			}
		}
		return romanLetter;
	}

}
