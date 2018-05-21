package com.dinu;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char[] c=str.toCharArray();
		for (int i = c.length-1; i < c.length; i--) {
			System.out.println(c[i]);
		}
	}

}
