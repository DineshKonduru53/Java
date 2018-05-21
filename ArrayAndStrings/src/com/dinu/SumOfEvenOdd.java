package com.dinu;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		int i=0,j=0,sumEven=0,sumOdd=0;
		for (i = 1; i < 10; i++) {
			if(i%2==0){
				System.out.print(i+" ");
				sumEven=sumEven+i;
			}
		}
		System.out.println("The sum of even numbers is"+sumEven);
	
		for (j = 1; j < 10; j++) {
			if(j%2 !=0){
				System.out.print(j+" ");
				sumOdd=sumOdd+j;
			}
		}
		
		System.out.println("The sum of odd numbers is"+sumOdd);
		
		System.out.println("The sum of even and odd is"+(sumEven+sumOdd));
	}
 
}
