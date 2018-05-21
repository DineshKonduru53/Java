package com.dinu;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int temp;
		boolean prime=true;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the no to check wheather the prime are not");
		int num=sc.nextInt();
		for (int i = 2; i <=num/2; i++) {
			temp=num%i;
			if(temp==0){
				prime=false;
				break;
			}
		}
		if(prime){
			System.out.println("The number is prime"+num);
		}else
		{
			System.out.println("The number is not prime"+num);
		}
	}

}
