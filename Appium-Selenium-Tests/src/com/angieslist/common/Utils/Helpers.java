package com.angieslist.common.Utils;

import java.util.Random;

public class Helpers {

	private static Random rand = new Random();
    
	public static String GetRandomEmailAddress() {
		int random = rand.nextInt((2147483647 - 1) + 1);
		char c = (char)(rand.nextInt(26) + 'a');
		
		String emailAddress = c+random+"@example.com";
		
		return emailAddress;
	}
    
}
