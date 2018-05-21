package com.dinu;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharactersInString2 {
	public static void main(String[] args) {
		String str="hhhnnn";
		int count=0;
		Set nonDuplicate=new HashSet<>();
		Set duplicate=new HashSet<>();
		char[] car=str.toCharArray();
		for (char  c: car) {
			if(!nonDuplicate.contains(c)){
				nonDuplicate.add(c);
			}else{
				duplicate.add(c);
			}
		}
		System.out.println(duplicate);
		
		
	}

}
