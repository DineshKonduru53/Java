package com.dinu;

import java.util.Arrays;

public class SortString {
	public static void main(String[] args) {
		String str="Dinesh";
		char c[]=str.toLowerCase().toCharArray();
		Arrays.sort(c);
		String sortString=new String(c);
		System.out.println(sortString);
	}

}
