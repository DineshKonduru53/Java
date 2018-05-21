package com.dinu;

import java.util.Scanner;

public class WordCountInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String s1=sc.nextLine();
		System.out.println("word count is"+countWords(s1));
	}
	public static int countWords(String string){
		String[] str=string.split(" ");
		int count=0;
		
		for (String s : str) {
			if(!s.equals("")){
				count++;
			}	
		}
		return count;
		
	}

}
