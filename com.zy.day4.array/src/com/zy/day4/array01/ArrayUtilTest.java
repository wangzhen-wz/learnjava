package com.zy.day4.array01;

import java.util.Arrays;

public class ArrayUtilTest {

	public static void main(String[] args) {

		int a[] = {6,7,3,34,53,2,31,457,87};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (i==a.length-1) {
				System.out.println(a[i]);
			}else {
				System.out.print(a[i]+",");
			}
		}
	
		System.out.println();
		
		int result = Arrays.binarySearch(a, 6);
		System.out.println(result);
	}

}
