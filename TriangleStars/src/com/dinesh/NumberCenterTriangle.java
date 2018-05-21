package com.dinesh;

public class NumberCenterTriangle {
	public static void main(String[] args) {
		
		
		for (int i = 5; i >0; i--) {
			for (int k = 4; k >=i ; k--) {
				System.out.print("* ");
			}
			
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"  ");
			}
			System.out.println("");
		}
		}

}
