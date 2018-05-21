package com.dinu;

public class MinAndMaxValue {
	public static void main(String[] args) {
		int array[]={20,40,30,10};
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		for (int number : array) {
			if(number>largest){
				largest=number;
			}
			
		}
		System.out.println("Largest="+largest);
		for (int number : array) {
			if(number<smallest){
				smallest=number;
			}
			
		}
		System.out.println("Smallest="+smallest);
	}

}
