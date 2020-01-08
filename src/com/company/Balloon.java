package com.company;

public class Balloon {
	private static final int VALUE_MAX = 100;
	private static int value_current = 0;
	
	public static void inflate(int value_to_add) {
		value_current = value_current + value_to_add;
		if (value_current <= VALUE_MAX)
			System.out.println(" надул шарик");
		else
			System.out.println(" лопнул шарик");
	}
}
