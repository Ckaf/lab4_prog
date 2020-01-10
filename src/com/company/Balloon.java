package com.company;

public class Balloon {
	private static final int VALUE_MAX = 100;
	private static int valueCurrent = 0;
	
	public static String inflate(int valueToAdd) {
		valueCurrent = valueCurrent + valueToAdd;
		if (valueCurrent <= VALUE_MAX)
			return "надул шарик";
		else
			return "лопнул шарик";
	}
}
