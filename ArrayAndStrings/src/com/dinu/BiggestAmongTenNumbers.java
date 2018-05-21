package com.dinu;

import java.util.Arrays;

public class BiggestAmongTenNumbers {
	public static void main(String[] args) {
		
		int array[]={60,30,5,3,57,34,45,65,22,11};
		Arrays.sort(array);
		System.out.println("The Biggest number is"+array[array.length-1]);
	}

}
