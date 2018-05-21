package com.dinu;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesNonDuplicates {
	public static void main(String[] args) {
		String duplicates[]=new String[]{"java","hibernate","spring","java"};
		Set duplicateSet=new HashSet<>();
		Set nonduplicateSet=new HashSet<>();
		for (String string : duplicates) {
			if(!nonduplicateSet.contains(string)){
				nonduplicateSet.add(string);
			}else{
				duplicateSet.add(string);
			}
			
			
		}
		System.out.println("The duplicates"+duplicateSet);
		System.out.println("The Non duplicates"+nonduplicateSet);
	}

}
