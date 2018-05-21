package com.dinu;

public class PrintNumbers {
	public static void main(String[] args) {
		printNumber(10);
	}
	
	public static void printNumber(int n){
		if(n>=1){
			System.out.println(n);
			printNumber(n-1);
		}
	}

}
