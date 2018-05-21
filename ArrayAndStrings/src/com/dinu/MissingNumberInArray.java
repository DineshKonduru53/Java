package com.dinu;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int array[]={1,2,3,4,6};
		int n=6;
		int actualTotal=0;
		int actualSum=0;
		for (int i = 0; i < n; i++) {
		actualTotal=(n*(n+1))/2;
			
		}
		for (int num : array) {
			actualSum=actualSum+num;
		}
		System.out.println("The missing number is="+(actualTotal-actualSum));
	}

}
