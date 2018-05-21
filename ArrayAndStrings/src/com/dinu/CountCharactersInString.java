package com.dinu;

import java.util.Scanner;

public class CountCharactersInString {
	public static void main(String[] args) {
		String line;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		line=sc.nextLine();
		char[] cc=line.toCharArray();
		for (int i = 0; i < cc.length; i++) {
			
			if(cc[i]!=' ')
			{
			count++;
			}
		}
		
		System.out.println(count);
	}

}
