package com.dinesh;

public class NumberLeftDifferent {
	public static void main(String[] args) {
		int rc=5,max=5,num=1;
		
		for (int i = 1; i <= rc; i++) {
			System.out.println("");
			for (int j = 1; j <=max; j++) {
				System.out.print(num);
				num++;
			}
			max--;
			num=i+1;
		}
	}

}
