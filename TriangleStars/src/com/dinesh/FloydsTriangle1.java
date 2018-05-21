package com.dinesh;

public class FloydsTriangle1 {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 5; i > 0 ; i--) {
			
			for (int k = 3; k >=i ; k--) {
				System.out.print("* ");
			}
			
			
			for (int j = 1; j <=i; j++) {
				System.out.print(j+"  ");
			}
			System.out.println("");
			
		}
	}

}
