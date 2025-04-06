package com.sakthi.code.leetcode.medium1;

public class AngleBetweenHandsOfClock {

	/*
	 * Given two numbers, hour and minutes, return the smaller angle (in degrees)
	 * formed between the hour and the minute hand.
	 */
	
	public static void main(String[] args) {
		AngleBetweenHandsOfClock obj=new AngleBetweenHandsOfClock();
		System.out.println(obj.getAngle(12, 30));
		System.out.println(obj.getAngle(3, 30));
		System.out.println(obj.getAngle(3, 15));

	}
	
	public double getAngle(int hour,int minute) {
		if(minute>60) {
			minute=minute%60;
			hour=hour+minute/60;
		}
		if(hour>12) {
			hour=hour%12;
		}
		double hourMove=hour*30+(minute*.5);
		double minuteMove=minute*6;
		double angle=Math.abs(hourMove-minuteMove);
		return Math.min(angle, 360-angle);
	}

}
