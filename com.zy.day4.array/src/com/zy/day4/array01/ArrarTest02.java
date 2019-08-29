package com.zy.day4.array01;

public class ArrarTest02 {
//æ≤Ã¨≥ı ºªØ
	public static void main(String[] args) {

		int[] intArray = {1,2,3};
		System.out.println(intArray[0]);
		
		for (int i = 0; i < intArray.length; i++) {
//			int j = intArray[i];
//			System.out.println(j);
			System.out.println(intArray[i]);
		}
		intArray[1] = 1024;
		System.out.println(intArray[1]);
	}

}
