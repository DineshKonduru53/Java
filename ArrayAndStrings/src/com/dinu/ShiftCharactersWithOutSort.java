package com.dinu;

import java.util.Scanner;

public class ShiftCharactersWithOutSort {
	public static void main(String[] args) {
		char temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		char[] a=str.toCharArray();
		System.out.println("The sort string is");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
		System.out.println("the biggest char is"+a[a.length-1]);
		
	}
	

}
