package com.dinu;

import java.util.Arrays;

public class AnagramDemo {
	public static void main(String[] args) {
		String string1="java";
		String string2="avaj";
		char c1[]=string1.toCharArray();
		char c2[]=string2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.equals(c1, c2));
		
	}

}
