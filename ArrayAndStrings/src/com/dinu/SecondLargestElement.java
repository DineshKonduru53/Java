package com.dinu;

import java.util.Arrays;

public class SecondLargestElement {
	public static void main(String[] args) {
		int array[]={10,40,30,20};
		Arrays.sort(array);
		System.out.println("the second largest"+array[array.length-2]);
		System.out.println("the third largest"+array[array.length-3]);
	}

}
